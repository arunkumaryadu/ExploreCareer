import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EcShowAllNoticeComponent } from './ec-show-all-notice.component';

describe('EcShowAllNoticeComponent', () => {
  let component: EcShowAllNoticeComponent;
  let fixture: ComponentFixture<EcShowAllNoticeComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EcShowAllNoticeComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EcShowAllNoticeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
