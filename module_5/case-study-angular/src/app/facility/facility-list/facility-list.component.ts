import {Component, OnInit} from '@angular/core';
import {Facility} from "../../model/facility/facility";

@Component({
  selector: 'app-facility-list',
  templateUrl: './facility-list.component.html',
  styleUrls: ['./facility-list.component.css']
})
export class FacilityListComponent implements OnInit {
  facilityList: Facility[] = [];

  constructor() {
    this.facilityList.push(
      {
        idFacility: 1, nameFacility: 'OCEAN SUITE', areaFacility: 10.1, costFacility: 100000, maxPeople: 10,
        imgFacility: "/assets/images/room1.jpg", rentType: {idRentType: 1, nameRentType: 'vip'},
        facilityType: {idFacilityTye: 1, nameFacilityType: 'villa'},
        standardRoom: 'tầm cỡ quốc tế', descriptionOther: 'sang trọng', poolArea: 20, facilityFree: 'buffet'
      },
      {
        idFacility: 2, nameFacility: 'OCEAN SUITE', areaFacility: 10.1, costFacility: 100000, maxPeople: 10,
        imgFacility: "/assets/images/room2.jpg", rentType: {idRentType: 2, nameRentType: 'normal'},
        facilityType: {idFacilityTye: 2, nameFacilityType: 'house'},
        standardRoom: 'Sang trọng, Đẳng cấp', descriptionOther: 'xu thế', poolArea: 20, facilityFree: 'buffet'
      },
      {
        idFacility: 3, nameFacility: 'OCEAN SUITE', areaFacility: 10.1, costFacility: 100000, maxPeople: 10,
        imgFacility: "/assets/images/room3.jpg", rentType: {idRentType: 1, nameRentType: 'vip'},
        facilityType: {idFacilityTye: 2, nameFacilityType: 'house'},
        standardRoom: 'Chu đáo , đầy đủ', descriptionOther: 'xu thế', poolArea: 20, facilityFree: 'buffet'
      },
      {
        idFacility: 4,
        nameFacility: 'OCEAN SUITE',
        areaFacility: 10.1,
        costFacility: 100000,
        maxPeople: 10,
        imgFacility: "/assets/images/room4.jpg",
        rentType: {idRentType: 2, nameRentType: 'normal'},
        facilityType: {idFacilityTye: 2, nameFacilityType: 'house'},
        standardRoom: 'Thể thao biển , lặn san hô',
        descriptionOther: 'xu thế',
        poolArea: 20,
        facilityFree: 'buffet'
      },
      {
        idFacility: 5,
        nameFacility: 'OCEAN SUITE',
        areaFacility: 10.1,
        costFacility: 100000,
        maxPeople: 10,
        imgFacility: "/assets/images/room5.jpg",
        rentType: {idRentType: 1, nameRentType: 'vip'},
        facilityType: {idFacilityTye: 2, nameFacilityType: 'house'},
        standardRoom: 'Cung cấp hình thức thể dục ,thể thao',
        descriptionOther: 'xu thế',
        poolArea: 20,
        facilityFree: 'buffet'
      },
      {
        idFacility: 6,
        nameFacility: 'OCEAN SUITE',
        areaFacility: 10.1,
        costFacility: 100000,
        maxPeople: 10,
        imgFacility: "/assets/images/room6.jpg",
        rentType: {idRentType: 2, nameRentType: 'normal'},
        facilityType: {idFacilityTye: 2, nameFacilityType: 'house'},
        standardRoom: 'Tận tâm , chuyên môn tầm cỡ',
        descriptionOther: 'xu thế',
        poolArea: 20,
        facilityFree: 'buffet'
      }
    )
  }

  ngOnInit(): void {
  }

}
