import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EcHeaderComponent } from './ec-header.component';

describe('EcHeaderComponent', () => {
  let component: EcHeaderComponent;
  let fixture: ComponentFixture<EcHeaderComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EcHeaderComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EcHeaderComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
