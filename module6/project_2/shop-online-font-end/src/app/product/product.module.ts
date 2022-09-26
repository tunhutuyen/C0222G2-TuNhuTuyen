import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { ProductRoutingModule } from './product-routing.module';
import { ProductListComponent } from './product-list/product-list.component';
import { CategoryProductComponent } from './category-product/category-product.component';
import { CartProductComponent } from './cart-product/cart-product.component';
import {ReactiveFormsModule} from "@angular/forms";
import { ProductDetailComponent } from './product-detail/product-detail.component';


@NgModule({
  declarations: [ProductListComponent, CategoryProductComponent, CartProductComponent, ProductDetailComponent],
    imports: [
        CommonModule,
        ProductRoutingModule,
        ReactiveFormsModule
    ]
})
export class ProductModule { }
