import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EcUserLoginComponent } from './ec-user-login.component';

describe('EcUserLoginComponent', () => {
  let component: EcUserLoginComponent;
  let fixture: ComponentFixture<EcUserLoginComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EcUserLoginComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EcUserLoginComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
