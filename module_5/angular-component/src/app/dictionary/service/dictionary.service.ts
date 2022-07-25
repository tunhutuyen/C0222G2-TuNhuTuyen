import { Injectable } from '@angular/core';
import {DictionaryEnglish} from "../model/dictionary-english";

@Injectable({
  providedIn: 'root'
})
export class DictionaryService {
    // @ts-ignore
  dictionary: DictionaryEnglish[] = [];
  constructor() {
    this.dictionary.push({word: 'Tai Dog',mean:'Tài Chó'},{word:'Tai Cat',mean:'Tài Mèo'},
      {word: 'Tai Chicken',mean:'Tài Gà'},{word: 'Tai Buffalo',mean:'Tài Trâu Chó'},{word: 'Talented',mean:'Tài lanh'});
  }
  getAll(){
    return this.dictionary;
  }
  findByKey(key:string){
    return this.dictionary.filter(dty => dty.word == key)
  }

  seach(searchName: any) {
    return this.dictionary.filter(dty => dty.word.includes(searchName));
  }
}
