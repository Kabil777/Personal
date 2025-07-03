package com.kabil.problems;

public class Question10 {

  public int reverseDigits(int n) {
    int m = 0;
    while (n > 0) {
      if (n % 10 == 0) {
        n /= 10;
      } else {
        m = m * 10 + n % 10;
        n /= 10;
      }
    }
    return m;
  }
}
