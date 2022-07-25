import {RentType} from "./rent-type";
import {FacilityType} from "./facility-type";

export interface Facility {
  idFacility?: number;
  nameFacility?: string;
  areaFacility?: number;
  costFacility?: number;
  maxPeople?: number;
  rentType?: RentType;
  facilityType?: FacilityType;
  standardRoom?: string;
  descriptionOther?: string;
  numberOfFloors?: number;
  poolArea?: number;
  facilityFree?: string;
  imgFacility?: string;
}
