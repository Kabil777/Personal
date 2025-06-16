package com.kabil;

public class Reverse {

  static void reverse(int p, int up) {
    if (up < 1) {
      System.out.println(p);
      return;
    }
    p = (10 * p) + (up % 10);
    reverse(p, up / 10);
  }

  public static void main(String[] args) {
    reverse(0, 1234);
  }
}
