import { TestBed } from '@angular/core/testing';

import { ExpertService } from './expert.service';

describe('ExpertService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: ExpertService = TestBed.get(ExpertService);
    expect(service).toBeTruthy();
  });
});
