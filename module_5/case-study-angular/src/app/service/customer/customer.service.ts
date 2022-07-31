import {Injectable} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Customer} from "../../model/customer";
import {Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class CustomerService {
  customerList: Customer[] = [];
  private URL_CUSTOMER = "http://localhost:3000/customer"

  constructor(private httpClient: HttpClient) {
  }

  getAll(): Observable<Customer[]> {
    return this.httpClient.get<Customer[]>(this.URL_CUSTOMER);
  }

  saveCustomer(customer: Customer): Observable<Customer> {
    return this.httpClient.post<Customer>(this.URL_CUSTOMER, customer);
  }

  deleteCustomer(customer: Customer) {
    return this.httpClient.delete<Customer>(this.URL_CUSTOMER+"/"+customer.id);
  }

  findById(id:number):Observable<Customer>{
    return this.httpClient.get<Customer>(this.URL_CUSTOMER+"/"+id);
  }

  editCustomer(customer:Customer):Observable<Customer>{
    return this.httpClient.patch<Customer>(this.URL_CUSTOMER+"/"+customer.id,customer);
  }

  searchFormCustomer(searchName: string, searchAddress: string):Observable<Customer[]> {
    return this.httpClient.get<Customer[]>(this.URL_CUSTOMER+"?nameCustomer_like="+searchName+"&address_like="+searchAddress);
  }
}
