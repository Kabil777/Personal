package com.kabil.problems;

public class Question7 {

  /**
   * Given a positive integer n, find the square root of n. If n is not a perfect
   * square, then return the floor value.
   * 
   * Floor value of any number is the greatest Integer which is less than or equal
   * to that number
   */
  static int sqrt(int n, int start, int end) {
    if (start > end) {
      return end;
    }
    int mid = start + (end - start) / 2;
    if (mid * mid == n) {
      return mid;
    }
    if (n > mid * mid) {
      return sqrt(n, mid + 1, end);
    }
    return sqrt(n, 0, mid - 1);

  }

  int floorSqrt(int n) {
    int sqrtNumber = sqrt(n, 0, n);
    // System.out.print(sqrtNumber);
    return sqrtNumber;
  }
}
