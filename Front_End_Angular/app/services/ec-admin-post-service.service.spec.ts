import { TestBed } from '@angular/core/testing';

import { EcAdminPostServiceService } from './ec-admin-post-service.service';

describe('EcAdminPostServiceService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: EcAdminPostServiceService = TestBed.get(EcAdminPostServiceService);
    expect(service).toBeTruthy();
  });
});
