import {Component, OnInit} from '@angular/core';
import {CustomerService} from "../../service/customer/customer.service";
import {CustomerTypeService} from "../../service/customer_type/customer-type.service";
import {ActivatedRoute, Router} from "@angular/router";
import {Customer} from "../../model/customer";
import {CustomerType} from "../../model/customer-type";
import {FormControl, FormGroup} from "@angular/forms";

@Component({
  selector: 'app-customer-edit',
  templateUrl: './customer-edit.component.html',
  styleUrls: ['./customer-edit.component.css']
})
export class CustomerEditComponent implements OnInit {
  customerDelete: Customer = {};
  customerTypeList: CustomerType[] = [];
  customerFormEdit: FormGroup;

  constructor(private customerService: CustomerService, private customerTypeService: CustomerTypeService,
              private activatedRoute: ActivatedRoute, private router: Router) {
  }

  ngOnInit(): void {
    this.activatedRoute.paramMap.subscribe((paramMap) => {
      const idDelete = parseInt(paramMap.get('idDelete'));
      this.customerService.findById(idDelete).subscribe(cs => {
        this.customerDelete = cs;
        this.customerTypeService.getAll().subscribe(cst => {
          this.customerTypeList = cst;
        }, error => {
        }, () => {
          this.customerFormEdit = new FormGroup({
            id: new FormControl(cs.id),
            nameCustomer: new FormControl(cs.nameCustomer),
            address: new FormControl(cs.address),
            dateOfBirth: new FormControl(cs.dateOfBirth),
            email: new FormControl(cs.email),
            gender: new FormControl(cs.gender),
            idCard: new FormControl(cs.idCard),
            phoneCustomer: new FormControl(cs.phoneCustomer),
            customerType: new FormControl(cs.customerType)
          });
        });
      });
    });
  }


  compareCustomerType(o1: CustomerType, o2: CustomerType){
    if( o1.id === o2.id ){
      return true;
    } else{
      return false;
    }
  }

  editCustomer() {
    const customer = this.customerFormEdit.value;
    this.customerService.editCustomer(customer).subscribe(data=>{
    },error => {
    },()=>{
      this.router.navigateByUrl("customer-list").then(()=>{
        alert("Edit success!!!");
      })
    })
  }
}
