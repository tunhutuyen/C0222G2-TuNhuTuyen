import {NgModule} from "@angular/core";
import {CommonModule} from "@angular/common";

import {CategoryListComponent} from "./category-list/category-list.component";
import {CategoryCreateComponent} from "./category-create/category-create.component";
import {CategoryEditComponent} from "./category-edit/category-edit.component";
import {CategoryDeleteComponent} from "./category-delete/category-delete.component";

import {ReactiveFormsModule} from "@angular/forms";
import {CategoryRoutingModule} from "./category-routing.module";

@NgModule({
  declarations: [CategoryListComponent, CategoryCreateComponent, CategoryEditComponent, CategoryDeleteComponent],
  exports: [
    CategoryListComponent
  ],
  imports: [
    CommonModule,
    CategoryRoutingModule,
    ReactiveFormsModule
  ]
})
export class CategoryModule { }
