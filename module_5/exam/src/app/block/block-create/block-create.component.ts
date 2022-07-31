import {Component, OnInit} from '@angular/core';
import {Product} from "../../model/product";
import {FormControl, FormGroup, Validators} from "@angular/forms";
import {Router} from "@angular/router";
import {ToastrService} from "ngx-toastr";
import {ProductService} from "../../service/product.service";
import {BlockService} from "../../service/block.service";

@Component({
  selector: 'app-block-create',
  templateUrl: './block-create.component.html',
  styleUrls: ['./block-create.component.css']
})
export class BlockCreateComponent implements OnInit {

  productList: Product[] = [];
  blockForm: FormGroup;
  submitted = false;

  constructor(private router: Router, private toast: ToastrService, private productService: ProductService,
              private blockService: BlockService) {
  }

  ngOnInit(): void {
    this.getAllProduct();
  }

  getAllProduct() {
    this.productService.getAll().subscribe(data => {
      this.productList = data;
      this.getForm();
    })
  }

  getForm() {
    this.blockForm = new FormGroup({
      codeBlock: new FormControl('', [Validators.required,Validators.pattern(/^(LH-)[0-9]{4}$/)]),
      product: new FormControl('', [Validators.required]),
      quantity: new FormControl('', [Validators.required]),
      dateImport: new FormControl('', [Validators.required]),
      dateStart: new FormControl('', [Validators.required]),
      dateEnd: new FormControl('', [Validators.required])
    })
  }

  submit() {
    // if (this.blockForm.valid) {
    //   this.submitted = true;
    //   const block = this.blockForm.value
    //   this.blockService.saveBlock(block).subscribe(cs => {
    //       this.submitted = false;
    //       this.router.navigateByUrl("block-list")
    //       this.toast.success('Create success', 'Create New')
    //       // this.ngOnInit();
    //     }, error => {
    //     },
    //     () => {
    //
    //     })
    // } else {
    //   this.submitted = true;
    // }
  }
  getCodeBlock(){
    return this.blockForm.controls.codeBlock;
  }
  getProduct(){
    return this.blockForm.controls.product;
  }
  getQuantity(){
    return this.blockForm.controls.quantity;
  }
  getDateImport(){
    return this.blockForm.controls.dateImport;
  }
  getDateStart(){
    return this.blockForm.controls.dateStart;
  }
  getDateEnd(){
    return this.blockForm.controls.quantity;
  }

}




