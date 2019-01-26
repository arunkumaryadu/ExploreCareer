import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EcReplyQuestionComponent } from './ec-reply-question.component';

describe('EcReplyQuestionComponent', () => {
  let component: EcReplyQuestionComponent;
  let fixture: ComponentFixture<EcReplyQuestionComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EcReplyQuestionComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EcReplyQuestionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
