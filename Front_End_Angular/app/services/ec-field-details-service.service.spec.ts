import { TestBed } from '@angular/core/testing';

import { EcFieldDetailsServiceService } from './ec-field-details-service.service';

describe('EcFieldDetailsServiceService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: EcFieldDetailsServiceService = TestBed.get(EcFieldDetailsServiceService);
    expect(service).toBeTruthy();
  });
});
