import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EcAskQuestionComponent } from './ec-ask-question.component';

describe('EcAskQuestionComponent', () => {
  let component: EcAskQuestionComponent;
  let fixture: ComponentFixture<EcAskQuestionComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EcAskQuestionComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EcAskQuestionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
