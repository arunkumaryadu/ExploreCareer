import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EcAddExpertComponent } from './ec-add-expert.component';

describe('EcAddExpertComponent', () => {
  let component: EcAddExpertComponent;
  let fixture: ComponentFixture<EcAddExpertComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EcAddExpertComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EcAddExpertComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
