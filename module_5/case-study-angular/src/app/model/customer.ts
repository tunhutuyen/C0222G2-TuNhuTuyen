import {CustomerType} from "./customer-type";

export interface Customer {
  id?: number;
  nameCustomer?: string;
  address?: string;
  dateOfBirth?: string;
  email?: string;
  gender?: number;
  idCard?: string;
  phoneCustomer?: string;
  customerType?: CustomerType;
}
