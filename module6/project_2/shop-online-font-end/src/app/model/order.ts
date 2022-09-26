import {Product} from "./product";
import {Customer} from "./customer";

export interface Order {
  id?: number;
  creationDate?: string;
  quantity?: number;
  isDeleted?: boolean;
  product?: Product;
  customer?: Customer;
}
