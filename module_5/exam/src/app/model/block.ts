import {Product} from "./product";

export interface Block {
  id?: number;
  codeBlock?: string;
  product?: Product;
  quantity?: number;
  dateImport?: string;
  dateStart?: string;
  dateEnd?: string;
}
