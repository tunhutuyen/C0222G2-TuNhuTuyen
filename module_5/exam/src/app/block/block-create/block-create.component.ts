import {Component, OnInit} from '@angular/core';
import {Product} from "../../model/product";
import {FormControl, FormGroup, Validators} from "@angular/forms";
import {Router} from "@angular/router";
import {ToastrService} from "ngx-toastr";
import {ProductService} from "../../service/product.service";
import {BlockService} from "../../service/block.service";
import {finalize} from "rxjs/operators";
import {formatDate} from "@angular/common";
import {AngularFireStorage} from "@angular/fire/storage";

@Component({
  selector: 'app-block-create',
  templateUrl: './block-create.component.html',
  styleUrls: ['./block-create.component.css']
})
export class BlockCreateComponent implements OnInit {

  productList: Product[] = [];
  blockForm: FormGroup;
  submitted = false;
  private selectedImage: any =null;


  constructor(private router: Router, private toast: ToastrService, private productService: ProductService,
              private blockService: BlockService,private storage: AngularFireStorage) {
  }

  ngOnInit(): void {
    this.getAllProduct();
  }

  getAllProduct() {
    this.productService.getAll().subscribe(data => {
      this.productList = data;
      console.log(this.productList)
      this.getForm();
    })
  }

  getForm() {
    this.blockForm = new FormGroup({
      imgProduct: new FormControl(''),
      codeBlock: new FormControl('', [Validators.required, Validators.pattern(/^(LH-)[0-9]{4}$/)]),
      product: new FormControl('', [Validators.required]),
      quantity: new FormControl('', [Validators.required]),
      dateImport: new FormControl('', [Validators.required]),
      dateStart: new FormControl('', [Validators.required]),
      dateEnd: new FormControl('', [Validators.required])
    })
  }

  submit() {
    if (this.blockForm.valid) {
      // this.submitted = true;
      const nameImg = this.getCurrentDateTime() + this.selectedImage.name;

      const fileRef = this.storage.ref(nameImg)
      const block = this.blockForm.value;
      this.storage.upload(nameImg, this.selectedImage).snapshotChanges().pipe(
        finalize(() => {
          fileRef.getDownloadURL().subscribe((url) => {
            this.blockForm.patchValue({imgProduct: url});
            this.blockService.saveBlock(block).subscribe(cs => {
              this.submitted = false;
              this.router.navigateByUrl("block-list")
              // this.ngOnInit();
              this.showToast();
            })
          })
        })
      ).subscribe()
    } else {
      this.submitted = true;
      this.showToast();
    }
  }

  showToast() {
    if (this.blockForm.valid) {
      this.toast.success('Create success!!!', 'Create', {
        timeOut: 1000,
        progressBar: true
      })
    } else {
      this.toast.error('Create fail!!!', 'Create', {
        timeOut: 1000,
        progressBar: true
      })
    }
  }

  getCurrentDateTime(): string {
    return formatDate(new Date(), 'dd-MM-yyyy-hh:mm:ssa', 'en-US');
  }

  getCodeBlock() {
    return this.blockForm.controls.codeBlock;
  }

  getProduct() {
    return this.blockForm.controls.product;
  }

  getQuantity() {
    return this.blockForm.controls.quantity;
  }

  getDateImport() {
    return this.blockForm.controls.dateImport;
  }

  getDateStart() {
    return this.blockForm.controls.dateStart;
  }

  getDateEnd() {
    return this.blockForm.controls.quantity;
  }

  showPreview(event: any) {
    this.selectedImage = event.target.files[0];
  }
}




