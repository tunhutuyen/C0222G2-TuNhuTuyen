import { Injectable } from '@angular/core';
import {Product} from "../model/product";

@Injectable({
  providedIn: 'root'
})
export class ProductService {
  products: Product[] = [{
    id: 1,
    name: 'IPhone 12',
    price: 2400000,
    description: 'New'
  }, {
    id: 2,
    name: 'IPhone 11',
    price: 1560000,
    description: 'Like new'
  }, {
    id: 3,
    name: 'IPhone X',
    price: 968000,
    description: '97%'
  }, {
    id: 4,
    name: 'IPhone 8',
    price: 7540000,
    description: '98%'
  }, {
    id: 5,
    name: 'IPhone 11 Pro',
    price: 1895000,
    description: 'Like new'
  }];
  constructor() { }

  getAll() {
    return this.products;
  }
  saveProduct(product) {
    this.products.push(product);
  }

  findProductById(id) {
    return this.products.filter(pd=>pd.id === id);
  }

  updateProduct(productEdit: Product) {
    for (let i=0;i<this.products.length;i++){
      if (productEdit.id === this.products[i].id){
        this.products[i] = productEdit;
      }
    }
  }

  deleteProduct(id: number) {
    return this.products = this.products.filter(pd=>pd.id !==id);
  }
}
