import { Component, OnInit } from '@angular/core';
import {AbstractControl, FormControl, FormGroup, Validators} from "@angular/forms";


export class country {
  id: number;
  name: string;

  constructor(id: number, name: string) {
    this.id = id;
    this.name = name;
  }
}

@Component({
  selector: 'app-register-account-use-reactive',
  templateUrl: './register-account-use-reactive.component.html',
  styleUrls: ['./register-account-use-reactive.component.css']
})
export class RegisterAccountUseReactiveComponent implements OnInit {
  countryList: country[] = [new country(1, "Vietnamese"),new country(2,"ToKyo"),
  new country(3,"Korea"),new country(4,"Laos")];
  registerUserFormReactive: FormGroup;


  constructor() {
    this.registerUserFormReactive = new FormGroup({
      email: new FormControl('',[Validators.required,Validators.email]),
      age: new FormControl('',[Validators.required,Validators.min(19)]),
      country: new FormControl('',[Validators.required]),
      gender: new FormControl('',[Validators.required]),
      phone: new FormControl('',[Validators.required,Validators.pattern(/^(\+84\s)[0-9]{9,10}$/)]),
      password: new FormGroup({
        pass: new FormControl('',[Validators.required,Validators.minLength(6)]),
        confirmPass: new FormControl('',[Validators.required,Validators.minLength(6)])
      },this.checkConfirmPassword)
    })
  }

  ngOnInit(): void {
  }

  createRegisterUserWithReactive() {
    console.log(this.registerUserFormReactive);
  }
  checkConfirmPassword(password:AbstractControl){
    let value = password.value;
    if (value.pass != value.confirmPass) {
      return {'confirmPassword' : true};
    }
    return null;
  }
}
