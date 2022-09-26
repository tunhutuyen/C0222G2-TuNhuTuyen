import {Component, OnInit} from '@angular/core';
import {Product} from "../../model/product";
import {FormControl, FormGroup} from "@angular/forms";
import {Category} from "../../model/category";
import {Customer} from "../../model/customer";
import {Title} from "@angular/platform-browser";
import {ToastrService} from "ngx-toastr";
import {ActivatedRoute, Router} from "@angular/router";
import {LogoutService} from "../../login/service/logout.service";
import {CookieService} from "../../login/service/cookie.service";
import {CommonService} from "../../login/service/common.service";
import {CustomerService} from "../../customer/service/customer.service";
import {Order} from "../../model/order";
import {ProductService} from "../service/product.service";
import {OriginDto} from "../../model/origin-dto";
import {OrderService} from "../service/order.service";

declare var $: any;
@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent implements OnInit {
  product: Product;
  role: string = '';
  username: string = '';
  token: string = '';
  products: Product[] = [];
  category: Category[] = [];
  searchForm: FormGroup;
  totalPages: number;
  number: number;
  countTotalPages: number[];
  customer: Customer;
  startPrice: string = '0';
  endPrice: string = '200000000';
  sort: string = '';
  categoryId: string = '';
  originDtos: OriginDto[] = [];
  public infoStatus: boolean = false;
  public originName = '';
  public totalProducts: number;
  public totalProductsFilter: number;
  public totalOneMi: number = 0;
  public totalThreeMi: number = 0;
  public totalFiveMi: number = 0;
  public totalTenMi: number = 0;
  public totalLetThanTenMi: number = 0;
  sortTitle: string = 'Sắp xếp theo';

  constructor(private title: Title,
              private cookieService: CookieService,
              private productService: ProductService,
              private toastrService: ToastrService,
              private logoutService: LogoutService,
              private router: Router,
              private activatedRoute: ActivatedRoute,
              private orderService: OrderService,
              private customerService: CustomerService,
              private commonService: CommonService) {
    this.title.setTitle("MiniShop3")
    this.role = this.readCookieService('role');
    this.username = this.readCookieService('username');
    this.token = this.readCookieService('jwToken');
  }

  readCookieService(key: string): string {
    return this.cookieService.getCookie(key);
  }

  ngOnInit(): void {
    this.getCategory();
    this.getAll(0, this.categoryId, '', '', this.startPrice, this.endPrice, this.sort);
    this.getCustomerByUsername(this.username);
    this.searchForm = new FormGroup({
      searchName: new FormControl(),
      searchOrigin: new FormControl(),
    });
    this.activatedRoute.paramMap.subscribe(value => {
      if (value.get('id') != null) {
        this.loadProductByCategory(value.get('id'));
      } else {
        this.loadProductByCategory('');
      }
    });
    this.sendMessage();
  }

  getAll(page: number, searchCategory, searchName, searchOrigin, searchStartPrice, searchEndPrice, sort) {
    this.productService.getAll(page, searchCategory, searchName, searchOrigin, searchStartPrice, searchEndPrice, sort).subscribe((data: any) => {
      if (data != null) {
        if (data.totalElements >= 0) {
          this.products = data.content;
          this.totalProductsFilter = data.content.length;
          if (searchOrigin == '') {
            this.originDtos = [];
          }
          for (let i = 0; i < data.content.length; i++) {
            let o = {
              name: data.content[i].manufacturer,
              quantity: 1
            };
            this.originDtos.push(o);
          }
          for (let i = 0; i < this.originDtos.length; i++) {
            for (let j = i + 1; j < this.originDtos.length; j++) {
              if (this.originDtos[i].name == this.originDtos[j].name) {
                if (this.originDtos[i].name != searchOrigin) {
                  this.originDtos[i].quantity = this.originDtos[i].quantity + 1;
                }
                this.originDtos.splice(j, 1);
                j--;
              }
            }
          }
        }
      } else {
        this.products = [];
      }
      if (this.products.length !== 0) {
        // @ts-ignore
        this.totalPages = data.totalPages;
        // @ts-ignore
        this.countTotalPages = new Array(data.totalPages);
        // @ts-ignore
        this.number = data.number;
      }
    });
    this.productService.getAllListProducts().subscribe(value => {
      if (value != null) {
        // @ts-ignore
        this.totalProducts = value.length;
        if (this.totalProductsFilter == undefined) {
          // @ts-ignore
          this.totalProductsFilter = value.length;
        }
      } else {
        this.totalProducts = 0;
      }
    });
  }

  getCategory() {
    this.productService.getAllCategory().subscribe(data => {
      // @ts-ignore
      this.category = data;
    })
  }

  getSearch() {
    const searchByName = this.searchForm.value.searchName;
    const searchByOrigin = this.searchForm.value.searchOrigin;
    this.getAll(0, this.categoryId, searchByName, searchByOrigin, this.startPrice, this.endPrice, this.sort);
  }

  goPrevious() {
    let numberPage: number = this.number;
    if (numberPage > 0) {
      numberPage--;
      this.getAll(numberPage, this.categoryId, '', '', this.startPrice, this.endPrice, this.sort);
    }
  }

  goNext() {
    let numberPage: number = this.number;
    if (numberPage < this.totalPages - 1) {
      numberPage++;
      this.getAll(numberPage, this.categoryId, '', '', this.startPrice, this.endPrice, this.sort);
    }
  }

  goItem(i: number) {
    this.getAll(i, this.categoryId, '', '', this.startPrice, this.endPrice, this.sort);
  }

  deleteProduct(product: Product) {
    this.productService.deleteProduct(product.id).subscribe(value => {
      this.ngOnInit();
      // $('#exampleModalDelete' + product.id).modal('hide');
      this.toastrService.success('Xóa thành công sản phẩm ' + product.name);
    });
  }


  addToCart(product: Product) {
    let order: Order = {
      customer: this.customer,
      product: product,
      quantity: 1
    };
    this.orderService.addOrder(order).subscribe((po: Order) => {
      this.toastrService.success('Thêm thành công sản phẩm: ' + po.product.name);
      this.sendMessage();
    }, error => {
      console.log(error.error.customer);
      if (error.error.message == 'quantity') {
        this.toastrService.warning('Số lượng tồn kho ko đủ!');
      }
    });
  }

  getCustomerByUsername(username: string) {
    console.log(username);
    this.customerService.getCustomerByUserName(username).subscribe(value => {
      this.customer = value;
      if (value == null) {
        this.infoStatus = true;
      } else {
        this.infoStatus = value.appUser.isDeleted;
      }
    });
  }

  addToCartMessage() {
    this.toastrService.warning('Vui lòng đăng nhập thành viên để thực hiện chức năng này!');
  }

  updateInfoMessage() {
    this.router.navigateByUrl('/info').then(value => {
      this.toastrService.warning('Vui lòng cập nhật thông tin để mua hàng!');
    });
  }

  sendMessage(): void {
    this.commonService.sendUpdate('Success!');
  }

  public fPrince: string = 'Tìm kiếm theo giá'

  filterPrice(start: string, end: string) {
    this.startPrice = start;
    this.endPrice = end;
    this.getAll(0, this.categoryId, '', '', start, end, this.sort)
    this.fPrince = "Từ " + start + 'đ - ' + end + 'đ'
  }

  public cName: string = 'Tìm kiếm theo danh mục';

  filterCategory(id: string, name: string) {
    this.getAll(0, id, '', '', this.startPrice, this.endPrice, this.sort);
    this.cName = 'Tìm kiếm theo ' + name;
  }

  sortByDate() {
    this.sortTitle = " Ngày mới nhập"
    this.sort = 'date_in,desc'
    console.log(this.sort)
    this.getAll(0, this.categoryId, '', '', this.startPrice, this.endPrice, this.sort);
  }

  sortByPriceDESC() {
    this.sortTitle = "Giá tăng dần"
    this.sort = 'price,asc'
    this.getAll(0, this.categoryId, '', '', this.startPrice, this.endPrice, this.sort);
  }

  sortByPriceASC() {
    this.sortTitle = "Giá giảm dần"
    this.sort = 'price,desc'
    this.getAll(0, this.categoryId, '', '', this.startPrice, this.endPrice, this.sort);
  }

  getTotalFilterPrice(categoryId: string) {
    this.productService.getAll(0, categoryId, '', '0', '1000000', '', this.sort).subscribe((value: any) => {
      if (value != null) {
        this.totalOneMi = value.content.length;
      } else {
        this.totalOneMi = 0;
      }
    });
    this.productService.getAll(0, categoryId, '', '1000001', '3000000', '', this.sort).subscribe((value: any) => {
      if (value != null) {
        this.totalThreeMi = value.content.length;
      } else {
        this.totalThreeMi = 0;
      }
    });
    this.productService.getAll(0, categoryId, '', '3000001', '5000000', '', this.sort).subscribe((value: any) => {
      if (value != null) {
        this.totalFiveMi = value.content.length;
      } else {
        this.totalFiveMi = 0;
      }
    });
    this.productService.getAll(0, categoryId, '', '5000001', '10000000', '', this.sort).subscribe((value: any) => {
      if (value != null) {
        this.totalTenMi = value.content.length;
      } else {
        this.totalTenMi = 0;
      }
    });

    this.productService.getAll(0, categoryId, '', '10000000', '400000000000', '', this.sort).subscribe((value: any) => {
      if (value != null) {
        this.totalLetThanTenMi = value.content.length;
      } else {
        this.totalLetThanTenMi = 0;
      }
    });
  }

  filterOrigin(originName: string) {
    this.originName = originName;
    this.getAll(0, this.categoryId, '', originName, this.startPrice, this.endPrice, this.sort);
  }

  loadProductByCategory(id: string) {
    this.categoryId = id;
    this.getSearch();
    $('[data-toggle="reset-active-category"]').attr('class', 'nav-item nav-link');
    $('#category' + id).attr('class', 'nav-item nav-link active');
    this.getTotalFilterPrice(id);
  }

  modalDelete(p: Product) {
    this.product = p;
  }
}

