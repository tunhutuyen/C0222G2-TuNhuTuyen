import { Component, OnInit } from '@angular/core';
import {Customer} from "../../model/customer";
import {Title} from "@angular/platform-browser";
import {CookieService} from "../../login/service/cookie.service";
import {CustomerService} from "../service/customer.service";

@Component({
  selector: 'app-customer-detail',
  templateUrl: './customer-detail.component.html',
  styleUrls: ['./customer-detail.component.css']
})
export class CustomerDetailComponent implements OnInit {

  role: string = '';
  username: string = '';
  token: string = '';
  customer: Customer;

  constructor(private title: Title,
              private cookieService: CookieService,
              private customerService: CustomerService
  ) {
    this.title.setTitle("Thông tin tài khoản")
    this.role = this.readCookieService('role');
    this.username = this.readCookieService('username');
    this.token = this.readCookieService('jwToken');
  }

  ngOnInit(): void {
    this.getInfo(this.username);
  }

  readCookieService(key: string): string {
    return this.cookieService.getCookie(key);
  }

  getInfo(userName) {
    this.customerService.getCustomerByUserName(userName).subscribe((value: Customer) => {
      this.customer = value;
    })
  }

}
