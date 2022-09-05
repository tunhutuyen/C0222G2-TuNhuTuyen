import {Component, OnInit} from '@angular/core';
import {BlockService} from "../../service/block.service";
import {ProductService} from "../../service/product.service";
import {ActivatedRoute, ParamMap, Router} from "@angular/router";
import {Block} from "../../model/block";
import {Product} from "../../model/product";
import {FormControl, FormGroup, Validators} from "@angular/forms";
import {ToastrService} from "ngx-toastr";


@Component({
  selector: 'app-block-edit',
  templateUrl: './block-edit.component.html',
  styleUrls: ['./block-edit.component.css']
})
export class BlockEditComponent implements OnInit {
  blockProduct: Block = {};
  productList: Product[] = [];
  blockFormEdit: FormGroup;
  submitted = false;

  constructor(private blockService: BlockService, private productService: ProductService, private activatedRoute: ActivatedRoute,
              private router: Router, private toast: ToastrService) {
  }

  ngOnInit(): void {
    this.activatedRoute.paramMap.subscribe((paramMap: ParamMap) => {
      const id = parseInt(paramMap.get('id'));
      this.blockService.findById(id).subscribe(b => {
        this.getAllProduct();
        console.log(b)
        this.blockFormEdit = new FormGroup({
          id: new FormControl(b.id),
          codeBlock: new FormControl(b.codeBlock, [Validators.required, Validators.pattern(/^(LH-)[0-9]{4}$/)]),
          product: new FormControl(b.product, [Validators.required]),
          quantity: new FormControl(b.quantity, [Validators.required]),
          dateImport: new FormControl(b.dateImport, [Validators.required]),
          dateStart: new FormControl(b.dateStart, [Validators.required]),
          dateEnd: new FormControl(b.dateEnd, [Validators.required])
        })
      })
    })
  }

  submitEdit() {
    if (this.blockFormEdit.valid) {
      const block = this.blockFormEdit.value
      this.blockService.editBlock(block).subscribe(cs => {
          this.submitted = false;
          this.router.navigateByUrl("block-list")
          this.showToast();
          // this.ngOnInit();
        }, error => {
        },
        () => {

        })
    } else {
      this.submitted = true;
      this.showToast()
    }
  }
  showToast(){
    if(this.blockFormEdit.valid){
      this.toast.success('Edit success!!!','Edit',{
        timeOut:1000,
        progressBar:true
      })
    }else {
      this.toast.error('Edit fail!!!','Edit',{
        timeOut:1000,
        progressBar:true
      })
    }
  }
  compareWithEdit(o1:Product,o2:Product){
    if( o1.id === o2.id ){
      return true;
    } else{
      return false;
    }
  }

  getAllProduct() {
    return this.productService.getAll().subscribe(data => {
      this.productList = data;
    })
  }

  getCodeBlock() {
    return this.blockFormEdit.controls.codeBlock;
  }

  getProduct() {
    return this.blockFormEdit.controls.product;
  }

  getQuantity() {
    return this.blockFormEdit.controls.quantity;
  }

  getDateImport() {
    return this.blockFormEdit.controls.dateImport;
  }

  getDateStart() {
    return this.blockFormEdit.controls.dateStart;
  }

  getDateEnd() {
    return this.blockFormEdit.controls.quantity;
  }
}
