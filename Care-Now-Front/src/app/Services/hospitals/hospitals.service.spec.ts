import { TestBed } from '@angular/core/testing';

import { HospitalsService } from './hospitals.service';

describe('HospitalsService', () => {
  let service: HospitalsService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(HospitalsService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
