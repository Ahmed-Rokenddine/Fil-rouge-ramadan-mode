import { TestBed } from '@angular/core/testing';

import { MedocsService } from './medocs.service';

describe('MedocsService', () => {
  let service: MedocsService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(MedocsService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
