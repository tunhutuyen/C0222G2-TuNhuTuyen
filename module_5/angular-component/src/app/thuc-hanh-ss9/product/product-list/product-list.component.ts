import { Component, OnInit } from '@angular/core';
import {Product} from "../../model/product";
import {ProductService} from "../../service/product.service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent implements OnInit {
  products: Product[]=[];
  constructor(private productService:ProductService,private router:Router) { }

  ngOnInit(): void {
    this.productService.getAll().subscribe(data=>{
      this.products = data;
    },error => {

    });
  }

}
