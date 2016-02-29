package com.bingkun.guice_test;

/**
 * Created by guobingkun on 2/3/15.
 */
public class SnailAdditionService implements IMathAdditionService {

  @Override
  public int sumOfAllConsecutiveNumbers(int n) {
    int sum = 0;
    long startTime = System.nanoTime();

    for (int i = 0; i <= n; ++i) {
      sum += i;
    }

    long endTime = System.nanoTime();
    System.out.println("Snail Addition Service Sum = " + sum);
    System.out.println("Time taken: " + (endTime - startTime));
    return sum;
  }


}
