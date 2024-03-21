import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AdminHospitalsComponent } from './admin-hospitals.component';

describe('AdminHospitalsComponent', () => {
  let component: AdminHospitalsComponent;
  let fixture: ComponentFixture<AdminHospitalsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AdminHospitalsComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AdminHospitalsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
