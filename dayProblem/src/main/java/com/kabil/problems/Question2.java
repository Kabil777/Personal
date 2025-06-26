package com.kabil.problems;

public class Question2 {

  /**
   * Given a number n, determine whether it is a prime number or not.
   */
  static boolean isPrime(int n) {
    // code here

    for (int i = 2; i * i <= n; i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;

  }
}
