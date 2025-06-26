package com.kabil.problems;

public class Question4 {

  /**
   * You are given an integer n. Your task is to determine whether it is a
   * palindrome.
   * 
   * A number is considered a palindrome if it reads the same backward as forward,
   * like the string examples "MADAM" or "MOM"
   */
  public boolean isPalindrome(int n) {
    int m = n;
    int rev = 0;
    while (n > 0) {
      // rev+=(10*(n%10));
      rev = 10 * rev + (n % 10);
      n /= 10;
    }
    if (rev == m) {
      return true;
    }
    return false;
  }
}
