import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AdminPharmaciesActiveComponent } from './admin-pharmacies-active.component';

describe('AdminPharmaciesActiveComponent', () => {
  let component: AdminPharmaciesActiveComponent;
  let fixture: ComponentFixture<AdminPharmaciesActiveComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AdminPharmaciesActiveComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AdminPharmaciesActiveComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
