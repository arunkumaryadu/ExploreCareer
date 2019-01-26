import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EcSingleStreamDetailsComponent } from './ec-single-stream-details.component';

describe('EcSingleStreamDetailsComponent', () => {
  let component: EcSingleStreamDetailsComponent;
  let fixture: ComponentFixture<EcSingleStreamDetailsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EcSingleStreamDetailsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EcSingleStreamDetailsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
