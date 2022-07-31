import {Component, OnInit} from '@angular/core';
import {Customer} from "../../model/customer";
import {ActivatedRoute, ParamMap, Router} from "@angular/router";
import {CustomerService} from "../../service/customer/customer.service";
import {CustomerTypeService} from "../../service/customer_type/customer-type.service";
import {FormControl, FormGroup} from "@angular/forms";
import {ToastrService} from "ngx-toastr";

@Component({
  selector: 'app-customer-list',
  templateUrl: './customer-list.component.html',
  styleUrls: ['./customer-list.component.css']
})
export class CustomerListComponent implements OnInit {
  customerList: Customer[] = [];
  customer: Customer = {};
  p: number = 1;
  searchAddress: string = '';
  searchName: string = '';
  formSearch: FormGroup;

  constructor(private activatedRoute: ActivatedRoute, private customerService: CustomerService, private router: Router,
              private toast:ToastrService) {
  }


  ngOnInit(): void {
    this.customerService.getAll().subscribe(data => {
      // this.p = 1;
      this.customerList = data;
      this.searchCustomer();
    }, error => {
    }, () => {
    })
  }
  searchCustomer(){
    this.formSearch = new FormGroup({
      searchByAddress: new FormControl(),
      searchByName: new FormControl()
    });
  }

  modalDelete(customer: Customer) {
    this.customer = customer;
  }

  deleteCustomer(customer: Customer) {
    this.customerService.deleteCustomer(customer).subscribe(ct =>{
      this.toast.success('Delete success','Delete')
      this.ngOnInit();
    },error => {
    },()=>{

    })
  }

  searchFormCustomer() {
    this.searchAddress = this.formSearch.value.searchByAddress;
    this.searchName = this.formSearch.value.searchByName;
    if (this.searchAddress == null) {
      this.searchAddress = '';
    }
    if (this.searchName == null) {
      this.searchName = '';
    }
    this.customerService.searchFormCustomer(this.searchName,this.searchAddress).subscribe(da=>{
      this.customerList = da;
        console.log(da)
    },error => {},
      ()=>{
        console.log(this.customerList);
      });
  }
}
