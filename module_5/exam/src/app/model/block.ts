import {Product} from "./product";

export interface Block {
  id?: number;
  codeBlock?: string;
  imgProduct?: string;
  product?: Product;
  quantity?: number;
  dateImport?: string;
  dateStart?: string;
  dateEnd?: string;
}
