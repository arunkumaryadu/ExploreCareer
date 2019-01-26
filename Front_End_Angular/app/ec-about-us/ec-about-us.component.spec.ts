import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EcAboutUsComponent } from './ec-about-us.component';

describe('EcAboutUsComponent', () => {
  let component: EcAboutUsComponent;
  let fixture: ComponentFixture<EcAboutUsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EcAboutUsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EcAboutUsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
