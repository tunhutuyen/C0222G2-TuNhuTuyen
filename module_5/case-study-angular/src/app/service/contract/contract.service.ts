import { Injectable } from '@angular/core';
import {Contract} from "../../model/contract";

@Injectable({
  providedIn: 'root'
})
export class ContractService {
  contracts: Contract[] = [];
  constructor() {
    this.contracts = [
      {id:0,startDate: '2001-01-01',endDate: '2002-02-02',deposit: 100, total:100000000,
        customer:{id:1,nameCustomer: 'Chỉ Tiến Không Lùi'},
        facility:{idFacility:1,nameFacility: 'Room'}
      },

      {id:1,startDate: '2001-01-01',endDate: '2002-02-02',deposit: 100, total:100000000,
        customer:{id:2,nameCustomer: 'Đã Lùi Thì Không Tiến'},
        facility:{idFacility:2,nameFacility: 'House'}
      },
      {id:2,startDate: '2001-01-01',endDate: '2002-02-02',deposit: 100, total:100000000,
        customer:{id:3,nameCustomer: 'Rẽ Trái'},
        facility:{idFacility:3,nameFacility: 'Villa'}
      },
      {id:3,startDate: '2001-01-01',endDate: '2002-02-02',deposit: 100, total:100000000,
        customer:{id:4,nameCustomer: 'Ngoạch Phải'},
        facility:{idFacility:4,nameFacility: 'Room'}
      },
      {id:4,startDate: '2001-01-01',endDate: '2002-02-02',deposit: 100, total:100000000,
        customer:{id:5,nameCustomer: 'Drift'},
        facility:{idFacility:5,nameFacility: 'Villa'}
      }
    ]
  }
  getAll(){
    return this.contracts;
  }
}
