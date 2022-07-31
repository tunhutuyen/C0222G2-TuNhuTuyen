import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { FooterComponent } from './footer/footer.component';
import { HeaderComponent } from './header/header.component';
import { CustomerListComponent } from './customer/customer-list/customer-list.component';
import { CustomerCreateComponent } from './customer/customer-create/customer-create.component';
import { FacilityListComponent } from './facility/facility-list/facility-list.component';
import { FacilityEditComponent } from './facility/facility-edit/facility-edit.component';
import { HomeComponent } from './home/home.component';
import {FuramaRoutingModule} from "./furama-routing.module";
import {RouterModule} from "@angular/router";
import { FacilityCreateComponent } from './facility/facility-create/facility-create.component';
import { CustomerEditComponent } from './customer/customer-edit/customer-edit.component';
import { ContractListComponent } from './contract/contract-list/contract-list.component';
import { ContractCreateComponent } from './contract/contract-create/contract-create.component';
import {HttpClientModule} from "@angular/common/http";
import {ReactiveFormsModule} from "@angular/forms";
import {NgxPaginationModule} from 'ngx-pagination'; // <-- import the module
import { ToastrModule } from 'ngx-toastr';
import {BrowserAnimationsModule} from "@angular/platform-browser/animations";

@NgModule({
  declarations: [
    AppComponent,
    FooterComponent,
    HeaderComponent,
    CustomerListComponent,
    CustomerCreateComponent,
    FacilityListComponent,
    FacilityEditComponent,
    HomeComponent,
    FacilityCreateComponent,
    CustomerEditComponent,
    ContractListComponent,
    ContractCreateComponent
  ],
  imports: [
    BrowserModule,
    RouterModule,
    HttpClientModule,
    ReactiveFormsModule,
    FuramaRoutingModule,
    NgxPaginationModule,
    ToastrModule.forRoot(),
    BrowserAnimationsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
