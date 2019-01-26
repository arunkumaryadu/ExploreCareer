import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EcSubjectAddComponent } from './ec-subject-add.component';

describe('EcSubjectAddComponent', () => {
  let component: EcSubjectAddComponent;
  let fixture: ComponentFixture<EcSubjectAddComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EcSubjectAddComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EcSubjectAddComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
