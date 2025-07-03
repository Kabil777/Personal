package com.kabil.problems;

public class Factorial {

  static int fact(int n, int factNumber) {
    if (n == 0) {
      return factNumber;
    }
    return fact(n - 1, factNumber *= n);
  }

  static int factorial(int n) {
    return fact(n, 1);
  }
}
