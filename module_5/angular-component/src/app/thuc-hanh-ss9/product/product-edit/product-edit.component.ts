import { Component, OnInit } from '@angular/core';
import {Product} from "../../model/product";
import {ProductService} from "../../service/product.service";
import {ActivatedRoute, ParamMap, Router} from "@angular/router";
import {FormControl, FormGroup} from "@angular/forms";
import {Category} from "../../model/category";
import {CategoryService} from "../../service/category.service";

@Component({
  selector: 'app-product-edit',
  templateUrl: './product-edit.component.html',
  styleUrls: ['./product-edit.component.css']
})
export class ProductEditComponent implements OnInit {
  productEdit:Product ={};
  productFormEdit: FormGroup;
  categoryList: Category[] =[];

  constructor(private productService: ProductService,private router:Router,private activatedRoute:ActivatedRoute,
              private categoryService:CategoryService) {

  }

  ngOnInit(): void {
    this.activatedRoute.paramMap.subscribe((paramMap:ParamMap)=>{
      const idEdit= parseInt(paramMap.get('idEdit'));
      this.productService.findById(idEdit).subscribe(productEdit=>{
        console.log(productEdit);
       this.categoryService.getAll().subscribe(data=>{
         this.categoryList = data;
       },error => {
       },()=>{
         this.productFormEdit = new FormGroup({
           id: new FormControl(productEdit.id),
           name: new FormControl(productEdit.name),
           price: new FormControl(productEdit.price),
           description: new FormControl(productEdit.description),
           category: new FormControl(productEdit.category)
         })
       })
      });

    })
  }

  submitEdit() {
    this.productService.updateProduct(this.productFormEdit.value).subscribe(pd=>{
      this.router.navigateByUrl("products/list").then(() => {
        alert("Edit success!");
      })
    })
  }

  compareCategory(o1: Category, o2: Category){
    if( o1.id === o2.id ){
      return true;
    } else{
      return false;
    }
  }
}
