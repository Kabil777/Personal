package com.kabil.problems;

public class GCD {

  /**
   * Given two positive integers a and b, find GCD of a and b.
   * 
   * Note: Don't use the inbuilt gcd function
   */
  public static int gcd(int a, int b) {
    int remainder = 0;
    while (b != 0) {
      remainder = a % b;
      a = b;
      b = remainder;

    }
    return a;
  }
}
