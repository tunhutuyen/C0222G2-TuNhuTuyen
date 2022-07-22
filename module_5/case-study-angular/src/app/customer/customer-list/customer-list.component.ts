import { Component, OnInit } from '@angular/core';
import {Customer} from "../../model/customer";

@Component({
  selector: 'app-customer-list',
  templateUrl: './customer-list.component.html',
  styleUrls: ['./customer-list.component.css']
})
export class CustomerListComponent implements OnInit {
  customerList: Customer[] = [];
  constructor() {
    this.customerList.push({
      idCustomer: 1, email: 'conlocdn@gmail.com', nameCustomer: 'tuyến', address: 'Đà Nẵng', gender: 1,
      idCard: '010101010101', phoneCustomer: '0123445678', dateOfBirth: '1999-12-28', customerType: {
        idCustomerType: 1,
        nameCustomerType: "Vip"
      }
    });
    this.customerList.push({
      idCustomer: 2, email: 'conlocdn1@gmail.com', nameCustomer: 'hòa chó', address: 'Đà Nẵng', gender: 0,
      idCard: '1111111111111  ', phoneCustomer: '0423412312', dateOfBirth: '2000-02-20', customerType: {
        idCustomerType: 2,
        nameCustomerType: "Gold"
      }
    });
    this.customerList.push({
      idCustomer: 3, email: 'lamgi@gmail.com', nameCustomer: 'hòa oshin', address: 'Đà Nẵng', gender: 1,
      idCard: '222222222222', phoneCustomer: '0123445678', dateOfBirth: '1990-05-13', customerType: {
        idCustomerType: 3,
        nameCustomerType: "Silver"
      }
    });
    this.customerList.push({
      idCustomer: 4, email: 'lamgi@gmail.com', nameCustomer: 'Hòa Phú Cường', address: 'Việt Nam', gender: 0,
      idCard: '4242424224', phoneCustomer: '2255523541311', dateOfBirth: '1990-05-13', customerType: {
        idCustomerType: 1,
        nameCustomerType: "Vip"
      }
    });

  }

  ngOnInit(): void {
  }

}
