import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {RouterModule, Routes} from "@angular/router";
import {FacilityListComponent} from "./facility/facility-list/facility-list.component";
import {FacilityEditComponent} from "./facility/facility-edit/facility-edit.component";
import {CustomerListComponent} from "./customer/customer-list/customer-list.component";
import {HomeComponent} from "./home/home.component";
import {FacilityCreateComponent} from "./facility/facility-create/facility-create.component";
import {CustomerCreateComponent} from "./customer/customer-create/customer-create.component";
import {CustomerEditComponent} from "./customer/customer-edit/customer-edit.component";
import {ContractListComponent} from "./contract/contract-list/contract-list.component";
import {ContractCreateComponent} from "./contract/contract-create/contract-create.component";

const routes: Routes = [
  {path: '',component: HomeComponent},
  {path: 'facility-list', component: FacilityListComponent},
  {path: 'facility-create', component: FacilityCreateComponent},
  {path: 'facility-edit/:id', component: FacilityEditComponent},
  {path: 'customer-list', component: CustomerListComponent},
  {path: 'customer-create', component: CustomerCreateComponent},
  {path: 'customer-edit/:id', component: CustomerEditComponent},
  {path: 'contract-list',component: ContractListComponent},
  {path: 'contract-create',component: ContractCreateComponent}
];

@NgModule({
  declarations: [],
  imports: [
    CommonModule,
    RouterModule.forRoot(routes)
  ]
})
export class FuramaRoutingModule { }
