import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FooterComponent } from './footer/footer.component';
import { HeaderComponent } from './header/header.component';
import { DetailProductComponent } from './product/detail-product/detail-product.component';
import { ListProductComponent } from './product/list-product/list-product.component';
import { LaptopProductComponent } from './product/laptop-product/laptop-product.component';
import { SmartPhoneProductComponent } from './product/smart-phone-product/smart-phone-product.component';
import { CartComponent } from './product/cart/cart.component';
import { HomeLoginComponent } from './login/home-login/home-login.component';
import {HomeComponent} from "./home/home.component";

@NgModule({
  declarations: [
    AppComponent,
    FooterComponent,
    HeaderComponent,
    HomeComponent,
    DetailProductComponent,
    ListProductComponent,
    LaptopProductComponent,
    SmartPhoneProductComponent,
    CartComponent,
    HomeLoginComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
