import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {CommonModule} from "@angular/common";
import {HomeComponent} from "./home/home.component";
import {DetailEmployeeComponent} from "./employee/detail-employee/detail-employee.component";
import {ListEmployeeComponent} from "./employee/list-employee/list-employee.component";


const routes: Routes = [
  {path: '', component: HomeComponent},
  {
    path: 'employee',
    component: ListEmployeeComponent,
  },
  {
    path: 'employee/detail/:id',
    component: DetailEmployeeComponent
  }
];

@NgModule({
  imports: [
    CommonModule,
    RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
