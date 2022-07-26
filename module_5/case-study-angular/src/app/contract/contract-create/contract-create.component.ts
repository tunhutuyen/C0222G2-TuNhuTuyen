import { Component, OnInit } from '@angular/core';
import {Contract} from "../../model/contract";
import {ContractService} from "../../service/contract/contract.service";

@Component({
  selector: 'app-contract-create',
  templateUrl: './contract-create.component.html',
  styleUrls: ['./contract-create.component.css']
})
export class ContractCreateComponent implements OnInit {
  contractList: Contract[]=[];

  constructor(private contractService:ContractService) { }

  ngOnInit(): void {
    this.contractList = this.contractService.getAll();
  }

}
