import {Component, OnInit} from '@angular/core';

@Component({
  selector: 'app-calculator',
  templateUrl: './calculator.component.html',
  styleUrls: ['./calculator.component.css']
})
export class CalculatorComponent implements OnInit {


  constructor() {
  }

  ngOnInit(): void {
  }

  number1: number = 0;
  number2: number = 0;
  result: number = 0;

  calculator(operator: string): number {
    switch (operator) {
      case '+':
        return this.result = this.number1 + this.number2;
      case '-':
        return this.result = this.number1 - this.number2;
      case '*':
        return this.result = this.number1 * this.number2;
      case '/':
        return this.result = this.number1 / this.number2;
    }
  }
}
