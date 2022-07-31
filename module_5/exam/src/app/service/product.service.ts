import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Product} from "../model/product";

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  // private URL_PRODUCT = "http://localhost:3000/product"
  private URL_PRODUCT = "http://localhost:8080/rest";
  constructor(private httpClient: HttpClient) {
  }

  getAll(): Observable<Product[]> {
    return this.httpClient.get<Product[]>(this.URL_PRODUCT +"/product-list");
  }

  // saveCustomer(product: Product): Observable<Product> {
  //   return this.httpClient.post<Product>(this.URL_PRODUCT, product);
  // }
  //
  // deleteCustomer(product: Product) {
  //   return this.httpClient.delete<Product>(this.URL_PRODUCT+"/"+product.id);
  // }
  // searchFormCustomer(searchName: string, searchAddress: string):Observable<Product[]> {
  //   return this.httpClient.get<Product[]>(this.URL_PRODUCT+"?nameCustomer_like="+searchName+"&address_like="+searchAddress);
  // }
}
