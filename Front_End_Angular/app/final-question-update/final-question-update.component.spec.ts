import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { FinalQuestionUpdateComponent } from './final-question-update.component';

describe('FinalQuestionUpdateComponent', () => {
  let component: FinalQuestionUpdateComponent;
  let fixture: ComponentFixture<FinalQuestionUpdateComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ FinalQuestionUpdateComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(FinalQuestionUpdateComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
