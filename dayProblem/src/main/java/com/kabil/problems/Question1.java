package com.kabil.problems;

import java.util.ArrayList;
import java.util.List;

public class Question1 {

  /**
   * Given an integer ‘N’, your task is to write a program that returns all the
   * divisors of ‘N’ in ascending order.
   */
  public static List<Integer> printDivisors(int n) {

    ArrayList<Integer> list = new ArrayList<>();
    for (int i = 1; i <= n / 2 + 1; i++) {
      if (n % i == 0) {
        list.add(i);
      }
    }
    list.add(n);
    return list;
  }

}
