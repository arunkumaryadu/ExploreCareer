import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EcFieldDisplayAllComponent } from './ec-field-display-all.component';

describe('EcFieldDisplayAllComponent', () => {
  let component: EcFieldDisplayAllComponent;
  let fixture: ComponentFixture<EcFieldDisplayAllComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EcFieldDisplayAllComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EcFieldDisplayAllComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
