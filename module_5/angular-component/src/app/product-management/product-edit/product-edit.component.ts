import {Component, OnInit} from '@angular/core';
import {FormControl, FormGroup} from "@angular/forms";
import {ProductService} from "../service/product.service";
import {ActivatedRoute, ParamMap, Router} from "@angular/router";
import {Product} from "../model/product";

@Component({
  selector: 'app-product-edit',
  templateUrl: './product-edit.component.html',
  styleUrls: ['./product-edit.component.css']
})
export class ProductEditComponent implements OnInit {
  productFormReactive: FormGroup;
  productEdit: Product = {};

  constructor(private productService: ProductService, private activatedRoute: ActivatedRoute,private router:Router) {
    this.activatedRoute.paramMap.subscribe((paramMap: ParamMap) => {
      const id = paramMap.get('id');
      const product = this.productService.findProductById(parseInt(id))[0];
      console.log(product);
      this.productFormReactive = new FormGroup({
        id: new FormControl(product.id),
        name: new FormControl(product.name),
        price: new FormControl(product.price),
        description: new FormControl(product.description)
      });
    });
  }

  ngOnInit(): void {
  }


  update() {
    this.productEdit = this.productFormReactive.value;
    this.productService.updateProduct(this.productEdit);
    this.router.navigateByUrl("/product/list")
  }
}
