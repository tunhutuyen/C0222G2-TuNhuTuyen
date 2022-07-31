import { Component, OnInit } from '@angular/core';
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
  blockProduct: Block ={}
  p: number = 1;
  searchAddress: string = '';
  searchName: string = '';
  formSearch: FormGroup;

  constructor(private toast:ToastrService,private blockProService: BlockService) {
  }


  ngOnInit(): void {
    this.getAll();
    this.searchBlock();
  }
  getAll(){
    this.blockProService.getAll().subscribe(data => {
      // @ts-ignore
      this.blockList = data.content;
    })
  }
  searchBlock(){
    this.formSearch = new FormGroup({
      searchByName: new FormControl()
    });
  }

  modalDelete(block: Block) {
    this.blockProduct = block;
    console.log(block)
  }

  deleteBlock(id: number) {
    this.blockProService.deleteBlock(id).subscribe(ct =>{
      this.toast.success('Delete success','Delete')
      this.ngOnInit();
    },error => {
    },()=>{

    })
  }

  searchFormBlock() {
    this.searchName = this.formSearch.value.searchByName;
    if (this.searchName == null) {
      this.searchName = '';
    }
    this.blockProService.searchFormBlock(this.searchName).subscribe(da=>{
        // @ts-ignore
        this.blockList = da.content;
        console.log(da)
      },error => {},
      ()=>{

      });
  }

}
