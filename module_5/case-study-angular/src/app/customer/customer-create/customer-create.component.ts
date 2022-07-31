import {Component, OnInit} from '@angular/core';
import {FormControl, FormGroup, Validators} from "@angular/forms";
import {CustomerType} from "../../model/customer-type";
import {Customer} from "../../model/customer";
import {CustomerTypeService} from "../../service/customer_type/customer-type.service";
import {Router} from "@angular/router";
import {CustomerService} from "../../service/customer/customer.service";
import {ToastrService} from "ngx-toastr";


@Component({
  selector: 'app-customer-create',
  templateUrl: './customer-create.component.html',
  styleUrls: ['./customer-create.component.css']
})
export class CustomerCreateComponent implements OnInit {
  customerCreate: Customer = {};
  customerTypeList: CustomerType[] = [];
  customerForm: FormGroup;
  submitted = false;

  constructor(private customerTypeService: CustomerTypeService, private customerService: CustomerService,
              private router: Router,private toast:ToastrService) {
  }

  ngOnInit(): void {
    this.getAllCustomerType();
  }

  getAllCustomerType() {
    this.customerTypeService.getAll().subscribe(data => {
      this.customerTypeList = data;
      this.getForm();
    })
  }

  getForm() {
    this.customerForm = new FormGroup({
      nameCustomer: new FormControl('', [Validators.required]),
      address: new FormControl('', [Validators.required]),
      dateOfBirth: new FormControl('', [Validators.required]),
      email: new FormControl('', [Validators.required]),
      gender: new FormControl('', [Validators.required]),
      idCard: new FormControl('', [Validators.required]),
      phoneCustomer: new FormControl('', [Validators.required]),
      customerType: new FormControl('', [Validators.required]),
    })
  }

  submit() {
    if (this.customerForm.valid){
      this.submitted = true;
      const customer = this.customerForm.value
      this.customerService.saveCustomer(customer).subscribe(cs => {
          this.submitted=false;
          this.router.navigateByUrl("customer-list")
          this.toast.success('Create success','Create New')
        // this.ngOnInit();
        }, error => {
        },
        () => {

        })
    }else {
      this.submitted = true;
    }

  }
  getNameCustomer(){
    return this.customerForm.controls.nameCustomer;
  }
  getAddress(){
    return this.customerForm.controls.address;
  }
  getDateOfBirth(){
    return this.customerForm.controls.dateOfBirth;
  }
  getEmail(){
    return this.customerForm.controls.email;
  }
  getGender(){
    return this.customerForm.controls.gender;
  }
  getCustomerType(){
    return this.customerForm.controls.customerType;
  }
  getIdCard(){
    return this.customerForm.controls.idCard;
  }
  getPhoneCustomer(){
    return this.customerForm.controls.phoneCustomer;
  }
}
