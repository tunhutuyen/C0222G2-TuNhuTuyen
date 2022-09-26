import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { HistoryOrderCustomerComponent } from './history-order-customer.component';

describe('HistoryOrderCustomerComponent', () => {
  let component: HistoryOrderCustomerComponent;
  let fixture: ComponentFixture<HistoryOrderCustomerComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ HistoryOrderCustomerComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(HistoryOrderCustomerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
