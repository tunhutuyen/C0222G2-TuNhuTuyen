import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {LaptopProductComponent} from "./laptop-product/laptop-product.component";
import {SmartPhoneProductComponent} from "./smart-phone-product/smart-phone-product.component";
import {ProductListComponent} from "./product-list/product-list.component";
import {CartProductComponent} from "./cart-product/cart-product.component";
import {ProductDetailComponent} from "./product-detail/product-detail.component";


const routes: Routes = [
  {path:'product/laptop',component:LaptopProductComponent},
  {path:'product/smartphone',component:SmartPhoneProductComponent},
  {path:'product/all',component: ProductListComponent},
  {path:'cart',component: CartProductComponent},
  {path:'product/detail/:id', component: ProductDetailComponent}
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class ProductRoutingModule { }
