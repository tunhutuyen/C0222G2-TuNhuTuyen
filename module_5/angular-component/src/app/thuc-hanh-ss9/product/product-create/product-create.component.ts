import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup} from "@angular/forms";
import {ProductService} from "../../service/product.service";
import {Category} from "../../model/category";
import {CategoryService} from "../../service/category.service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-product-create',
  templateUrl: './product-create.component.html',
  styleUrls: ['./product-create.component.css']
})
export class ProductCreateComponent implements OnInit {
  categorys: Category[] =[];
  categoryAdd: Category ={};
  productForm: FormGroup = new FormGroup({
    id: new FormControl(),
    name: new FormControl(),
    price: new FormControl(),
    description: new FormControl(),
    category: new FormControl()
  });

  constructor(private productService: ProductService,private categoryService:CategoryService,private router:Router) {
  }

  ngOnInit() {
      this.getAllCategory();
  }
  //
  submit() {
    const product = this.productForm.value;
    console.log(product);
    this.productService.saveProduct(product).subscribe(data =>{
    },error=>{},
      ()=> this.router.navigateByUrl("products/list"))
  }
  getAllCategory(){
    this.categoryService.getAll().subscribe(data=>{
      this.categorys = data;

    })
  }

  // onChange(value: Category) {
    // console.log(value);
    // console.log(this.categoryAdd);
  // }
}
