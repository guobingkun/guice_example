package com.bingkun.guice_test;

import com.google.inject.Guice;
import com.google.inject.Injector;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by guobingkun on 2/3/15.
 */
public class MathApp {

  public static void main(String args[]) {
    Injector injector = Guice.createInjector(new MathModule());
    MathClient mathClient = injector.getInstance(MathClient.class);
    mathClient.sumOfAllConsecutiveNumbers(100);
  }
}
