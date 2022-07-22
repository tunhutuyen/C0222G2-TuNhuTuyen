import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { RegisterAccountUseReactiveComponent } from './register-account-use-reactive.component';

describe('RegisterAccountUseReactiveComponent', () => {
  let component: RegisterAccountUseReactiveComponent;
  let fixture: ComponentFixture<RegisterAccountUseReactiveComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ RegisterAccountUseReactiveComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(RegisterAccountUseReactiveComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
