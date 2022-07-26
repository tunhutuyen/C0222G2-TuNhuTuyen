import {ProductListComponent} from "./product-list/product-list.component";
import {ProductCreateComponent} from "./product-create/product-create.component";
import {ProductEditComponent} from "./product-edit/product-edit.component";
import {ProductDeleteComponent} from "./product-delete/product-delete.component";
import {CommonModule} from "@angular/common";

import {ReactiveFormsModule} from "@angular/forms";
import {NgModule} from "@angular/core";
import {ProductRoutingModule} from "./product-routing.module";

@NgModule({
  declarations: [
    ProductListComponent,
    ProductCreateComponent,
    ProductEditComponent,
    ProductDeleteComponent
  ],
  imports: [
    CommonModule,
    ProductRoutingModule,
    ReactiveFormsModule
  ]
})
export class ProductModule {
}
