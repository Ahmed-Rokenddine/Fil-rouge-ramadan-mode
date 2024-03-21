import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AdminPharmaciesCrudComponent } from './admin-pharmacies-crud.component';

describe('AdminPharmaciesCrudComponent', () => {
  let component: AdminPharmaciesCrudComponent;
  let fixture: ComponentFixture<AdminPharmaciesCrudComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AdminPharmaciesCrudComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AdminPharmaciesCrudComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
