import {Injectable} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Block} from "../model/block";


@Injectable({
  providedIn: 'root'
})
export class BlockService {

  private URL_BLOCK = "http://localhost:8080/rest"

  constructor(private httpClient: HttpClient) {
  }

  getAll(): Observable<Block[]> {
    return this.httpClient.get<Block[]>(this.URL_BLOCK + "/block-list");
  }

  findById(id: number): Observable<Block> {
    return this.httpClient.get<Block>(this.URL_BLOCK + "/" + id);
  }

  // editBlock(block: Block): Observable<Block> {
  //   return this.httpClient.patch<Block>(this.URL_BLOCK, block)
  // }
  //
  saveBlock(block: Block): Observable<Block> {
    return this.httpClient.post<Block>(this.URL_BLOCK+"/block-create", block);
  }

  deleteBlock(idDelete: number) {
    return this.httpClient.delete<Block>(this.URL_BLOCK + "/block-delete/" + idDelete);
  }

  searchFormBlock(searchName: string): Observable<Block[]> {
    return this.httpClient.get<Block[]>(this.URL_BLOCK + "?product.name_like=" + searchName);
  }
}
