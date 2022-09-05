import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SmartPhoneProductComponent } from './smart-phone-product.component';

describe('SmartPhoneProductComponent', () => {
  let component: SmartPhoneProductComponent;
  let fixture: ComponentFixture<SmartPhoneProductComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SmartPhoneProductComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SmartPhoneProductComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
