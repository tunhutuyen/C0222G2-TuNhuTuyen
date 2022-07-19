import { Component, OnInit } from '@angular/core';
import {Pet} from '../pet/Pet';

@Component({
  selector: 'app-pet',
  templateUrl: './pet.component.html',
  styleUrls: ['./pet.component.css']
})
export class PetComponent implements OnInit {

  pet: Pet = {
    name: 'hòa chó điên',
    image: 'https://benh.vn/wp-content/uploads/2018/04/cho-lay-truyen-benh-daijpg.jpg'
  };

  constructor() { }

  ngOnInit(): void {
  }

}
