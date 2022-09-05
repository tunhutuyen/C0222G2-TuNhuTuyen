import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {HomeComponent} from "./home/home.component";
import {DetailProductComponent} from "./product/detail-product/detail-product.component";
import {LaptopProductComponent} from "./product/laptop-product/laptop-product.component";
import {SmartPhoneProductComponent} from "./product/smart-phone-product/smart-phone-product.component";
import {CartComponent} from "./product/cart/cart.component";
import {HomeLoginComponent} from "./login/home-login/home-login.component";


const routes: Routes = [
  {
    path: '',
    pathMatch: 'full',
    redirectTo: 'home'
  },
  {path: '', component: HomeComponent},
  // {path:'san-pham/chi-tiet/:id',component: DetailProductComponent},
  {path:'san-pham/chi-tiet/1',component: DetailProductComponent},
  {path:'san-pham/may-tinh',component: LaptopProductComponent},
  {path:'san-pham/dien-thoai',component: SmartPhoneProductComponent},
  {path:'san-pham/gio-hang',component: CartComponent},
  {path:'login',component: HomeLoginComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
