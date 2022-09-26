import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {CustomerDetailComponent} from "./customer-detail/customer-detail.component";
import {HistoryOrderCustomerComponent} from "./history-order-customer/history-order-customer.component";


const routes: Routes = [
  {path:'info',component: CustomerDetailComponent},
  {path:'history',component:HistoryOrderCustomerComponent}
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class CustomerRoutingModule { }
