import {Component, OnInit} from '@angular/core';
import {Block} from "../../model/block";
import {FormControl, FormGroup} from "@angular/forms";
import {ActivatedRoute, Router} from "@angular/router";
import {BlockService} from "../../service/block.service";
import {ToastrService} from "ngx-toastr";
import {ProductService} from "../../service/product.service";

@Component({
  selector: 'app-block-list',
  templateUrl: './block-list.component.html',
  styleUrls: ['./block-list.component.css']
})
export class BlockListComponent implements OnInit {

  blockList: Block[] = [];
  blockProduct: Block = {}
  p: number = 1;
  searchAddress: string = '';
  searchName: string = '';
  formSearch: FormGroup;
  number: number;
  totalPages: number;
  countTotalPages: number[];

  constructor(private toast: ToastrService, private blockProService: BlockService) {
  }


  ngOnInit(): void {
    this.getAll(0);
    this.searchBlock();
  }

  getAll(page: number) {
    this.blockProService.getAllBlock(page).subscribe(data => {
      // @ts-ignore
      this.blockList = data.content;
      // @ts-ignore
        this.number = data.number;
      // @ts-ignore
      this.countTotalPages = new Array(data.totalPages);
      // @ts-ignore
      this.totalPages = data.totalPages;
    })
  }

  searchBlock() {
    this.formSearch = new FormGroup({
      searchByName: new FormControl()
    });
  }

  modalDelete(block: Block) {
    this.blockProduct = block;
    console.log(block)
  }

  deleteBlock(id: number) {
    this.blockProService.deleteBlock(id).subscribe(ct => {
      this.toast.success('Delete success', 'Delete employee')
      this.ngOnInit();
    }, error => {
    }, () => {

    })
  }

  searchFormBlock() {
    this.searchName = this.formSearch.value.searchByName;
    console.log(this.searchName)
    if (this.searchName == null) {
      this.searchName = '';
    }
    this.blockProService.searchFormBlock(this.searchName).subscribe(da => {
        if (da == null) {
          this.blockList = [];
        } else {
          // @ts-ignore
          this.blockList = da.content;
        }
        console.log(da)
      }, error => {
      },
      () => {

      });
  }

  goPrevious() {
    let numberPage: number = this.number;
    if (numberPage > 0) {
      numberPage--;
      this.getAll(numberPage);
    }
  }

  goNext() {
    let numberPage: number = this.number;
    if (numberPage < this.totalPages - 1) {
      numberPage++;
      this.getAll(numberPage);
    }
  }

  goItem(i: number) {
    this.getAll(i);
  }

}
