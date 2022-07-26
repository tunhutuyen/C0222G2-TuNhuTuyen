import { Component, OnInit } from '@angular/core';
import {ProductService} from "../../service/product.service";
import {ActivatedRoute, Router} from "@angular/router";
import {FormControl, FormGroup} from "@angular/forms";
import {Product} from "../../model/product";

@Component({
  selector: 'app-product-delete',
  templateUrl: './product-delete.component.html',
  styleUrls: ['./product-delete.component.css']
})
export class ProductDeleteComponent implements OnInit {
  productFormDelete: FormGroup;
  productDelete:Product={};
  constructor(private productService:ProductService, private router:Router,private activatedRoute:ActivatedRoute) { }

  ngOnInit(): void {
    this.activatedRoute.paramMap.subscribe(paramMap =>{
      const id = parseInt(paramMap.get('idDelete'));
      this.productService.findById(id).subscribe(data =>{
         this.productDelete = data;
      },error => {
      },()=>{
        this.productFormDelete = new FormGroup({
          id: new FormControl(this.productDelete.id),
          name: new FormControl(this.productDelete.name),
          price: new FormControl(this.productDelete.price),
          description: new FormControl(this.productDelete.description),
          category: new FormControl(this.productDelete.category.nameCategory)
        })
      })
    })
  }
  submitDelete(){
    this.productService.deleteProduct(this.productFormDelete.value.id).subscribe(pd=>{
    },error => {
    },()=>{
      this.router.navigateByUrl('products/list').then(()=>{
        alert("Delete success!!!");
      })
    })
  }

}
