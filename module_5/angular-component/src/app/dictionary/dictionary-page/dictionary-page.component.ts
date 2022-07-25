import { Component, OnInit } from '@angular/core';
import {DictionaryEnglish} from "../model/dictionary-english";
import {DictionaryService} from "../service/dictionary.service";
import {NgForm} from "@angular/forms";

@Component({
  selector: 'app-dictionary-page',
  templateUrl: './dictionary-page.component.html',
  styleUrls: ['./dictionary-page.component.css']
})
export class DictionaryPageComponent implements OnInit {
  dictionaryList:DictionaryEnglish[] =[];
  constructor(private dictionaryService: DictionaryService) { }

  ngOnInit(): void {
    this.dictionaryList= this.dictionaryService.getAll();
  }

  seach(searchWord: NgForm) {
    this.dictionaryList = this.dictionaryService.seach(searchWord.value.searchName)
  }
}
