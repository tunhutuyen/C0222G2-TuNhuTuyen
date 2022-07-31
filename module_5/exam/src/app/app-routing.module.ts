import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {HomeComponent} from "./home/home.component";
import {CommonModule} from "@angular/common";
import {BlockListComponent} from "./block/block-list/block-list.component";
import {BlockCreateComponent} from "./block/block-create/block-create.component";
import {BlockEditComponent} from "./block/block-edit/block-edit.component";



const routes: Routes = [
  {path: '', component: HomeComponent},
  {path:'block-list',component:BlockListComponent},
  {path:'block-create',component:BlockCreateComponent},
  {path:'block-edit/:id',component:BlockEditComponent}
];

@NgModule({
  imports: [
    CommonModule,
    RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
