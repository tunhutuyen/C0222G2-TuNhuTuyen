import { Component, OnInit } from '@angular/core';
import {DictionaryEnglish} from "../model/dictionary-english";
import {ActivatedRoute, ParamMap} from "@angular/router";
import {DictionaryService} from "../service/dictionary.service";

@Component({
  selector: 'app-dictionary-translate',
  templateUrl: './dictionary-translate.component.html',
  styleUrls: ['./dictionary-translate.component.css']
})
export class DictionaryTranslateComponent implements OnInit {
  // @ts-ignore
  diction:DictionaryEnglish ={};
  constructor(private activatedRoute: ActivatedRoute,private dictionaryService:DictionaryService) {
    activatedRoute.paramMap.subscribe((paramMap:ParamMap) =>{
      const word = paramMap.get('key');
      this.diction = this.dictionaryService.findByKey(word)[0];
    },error => {
    },() =>{}
    )
  }

  ngOnInit(): void {
  }

}
