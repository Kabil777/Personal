package com.kabil.problems;

public class PowerOfNumbers {

  public int reverseExponentiation(int n) {
    int base = n;
    int power = 1;

    int m = 0;
    while (n > 0) {
      m = m * 10 + n % 10;
      n /= 10;
    }
    n = m;

    while (n > 0) {
      if ((n & 1) == 1) {
        power *= base;
      }
      base *= base;
      n = n >> 1;
    }
    return power;
  }
}
