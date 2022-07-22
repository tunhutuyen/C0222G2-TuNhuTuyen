export interface Customer {
  idCustomer?: number;
  nameCustomer?: string;
  address?: string;
  dateOfBirth?: string;
  email?: string;
  gender?: number;
  idCard?: string;
  phoneCustomer?: string;
  customerType?: {
    idCustomerType?: number;
    nameCustomerType?: string;
  }
}
