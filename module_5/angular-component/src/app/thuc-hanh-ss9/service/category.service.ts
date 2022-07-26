import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Category} from "../model/category";

@Injectable({
  providedIn: 'root'
})
export class CategoryService {
  private URL_CATEGORY = "http://localhost:3000/category";
  // private URL_CATEGORY = "http://localhost:8080/category-rest/list";
  constructor(private http: HttpClient) {
  }

  getAll(): Observable<Category[]> {
    return this.http.get<Category[]>(this.URL_CATEGORY);
  }

  // saveCategory(category): Observable<Category> {
  //   return this.http.post<Category>(API_URL + '/categories', category);
  // }
  //
  findById(id: number): Observable<Category> {
    return this.http.get<Category>(this.URL_CATEGORY + '/id');
  }
  //
  // updateCategory(id: number, category: Category): Observable<Category> {
  //   return this.http.put<Category>(`${API_URL}/categories/${id}`, category);
  // }
  //
  // deleteCategory(id: number): Observable<Category> {
  //   return this.http.delete<Category>(`${API_URL}/categories/${id}`);
  // }
}
