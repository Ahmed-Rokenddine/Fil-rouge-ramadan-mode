import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MedocsComponent } from './medocs.component';

describe('MedocsComponent', () => {
  let component: MedocsComponent;
  let fixture: ComponentFixture<MedocsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ MedocsComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(MedocsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
