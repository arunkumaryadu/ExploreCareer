import { TestBed } from '@angular/core/testing';

import { EcFieldServiceService } from './ec-field-service.service';

describe('EcFieldServiceService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: EcFieldServiceService = TestBed.get(EcFieldServiceService);
    expect(service).toBeTruthy();
  });
});
