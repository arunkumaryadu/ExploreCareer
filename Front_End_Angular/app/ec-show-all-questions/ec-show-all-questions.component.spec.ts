import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EcShowAllQuestionsComponent } from './ec-show-all-questions.component';

describe('EcShowAllQuestionsComponent', () => {
  let component: EcShowAllQuestionsComponent;
  let fixture: ComponentFixture<EcShowAllQuestionsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EcShowAllQuestionsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EcShowAllQuestionsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
