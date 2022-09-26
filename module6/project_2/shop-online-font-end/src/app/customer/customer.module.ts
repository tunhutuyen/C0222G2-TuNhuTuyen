import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { CustomerRoutingModule } from './customer-routing.module';
import { CustomerDetailComponent } from './customer-detail/customer-detail.component';
import { HistoryOrderCustomerComponent } from './history-order-customer/history-order-customer.component';


@NgModule({
  declarations: [CustomerDetailComponent, HistoryOrderCustomerComponent],
  imports: [
    CommonModule,
    CustomerRoutingModule
  ]
})
export class CustomerModule { }
