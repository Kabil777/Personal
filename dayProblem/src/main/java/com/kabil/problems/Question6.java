package com.kabil.problems;

public class Question6 {

  /**
   * Given a number n, check if the number is perfect or not. A number is
   * said to be perfect if sum of all its factors excluding the number
   * itself is equal to the number.
   * 
   */
  static boolean isPerfect(int n) {
    int sum = 1;
    for (int i = 2; i * i < n; i++) {
      if (n % i == 0) {
        sum += i;
        sum += n / i;
      }
    }
    if (sum == n) {
      return true;
    }
    return false;
  }
}
