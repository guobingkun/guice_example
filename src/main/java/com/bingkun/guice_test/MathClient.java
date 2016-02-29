package com.bingkun.guice_test;

import com.google.inject.Inject;
/**
 * Created by guobingkun on 2/3/15.
 */
public class MathClient {

  private final IMathAdditionService mathService;

  @Inject
  public MathClient(IMathAdditionService mathService) {
    this.mathService = mathService;
  }

  public int sumOfAllConsecutiveNumbers(int n) {
    return mathService.sumOfAllConsecutiveNumbers(n);
  }
}
