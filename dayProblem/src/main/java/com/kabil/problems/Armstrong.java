package com.kabil.problems;

public class Armstrong {

  /**
   * You are given a 3-digit number n, Find whether it is an Armstrong number or
   * not.
   * 
   * An Armstrong number of three digits is a number such that the sum of the
   * cubes of its digits is equal to the number itself. 371 is an Armstrong number
   * since 33 + 73 + 13 = 371.
   */
  static int amstrong(int n, int cubeSum) {
    if (n <= 0) {
      return cubeSum;
    }
    return amstrong(n / 10, cubeSum += Math.pow(n % 10, 3));
  }

  static boolean armstrongNumber(int n) {
    if (amstrong(n, 0) == n) {
      return true;
    }
    return false;
  }
}
