import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ShowColorComponent } from './show-color.component';

describe('ShowColorComponent', () => {
  let component: ShowColorComponent;
  let fixture: ComponentFixture<ShowColorComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ShowColorComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ShowColorComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
