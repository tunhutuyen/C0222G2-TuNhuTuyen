import { Component, OnInit } from '@angular/core';
import {Product} from "../model/product";
import {ProductService} from "../service/product.service";
import {ActivatedRoute, ParamMap, Router} from "@angular/router";

@Component({
  selector: 'app-product-delete',
  templateUrl: './product-delete.component.html',
  styleUrls: ['./product-delete.component.css']
})
export class ProductDeleteComponent implements OnInit {
  productDelete: Product = {};
  constructor(private productService:ProductService,private activatedRoute:ActivatedRoute,private router:Router) {
    this.activatedRoute.paramMap.subscribe((paramMap:ParamMap)=>{
      const id = paramMap.get('id');
      this.productDelete = this.productService.findProductById(parseInt(id))[0];
    })
  }

  ngOnInit(): void {
  }

  deleteProduct(id: number) {
    this.productService.deleteProduct(id);
    this.router.navigateByUrl('/product/list');
  }
}
