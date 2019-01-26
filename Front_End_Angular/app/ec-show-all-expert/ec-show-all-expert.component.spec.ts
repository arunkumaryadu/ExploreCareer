import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EcShowAllExpertComponent } from './ec-show-all-expert.component';

describe('EcShowAllExpertComponent', () => {
  let component: EcShowAllExpertComponent;
  let fixture: ComponentFixture<EcShowAllExpertComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EcShowAllExpertComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EcShowAllExpertComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
