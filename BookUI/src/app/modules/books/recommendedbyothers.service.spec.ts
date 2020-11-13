import { TestBed } from '@angular/core/testing';

import { RecommendedbyothersService } from './recommendedbyothers.service';

describe('RecommendedbyothersService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: RecommendedbyothersService = TestBed.get(RecommendedbyothersService);
    expect(service).toBeTruthy();
  });
});
