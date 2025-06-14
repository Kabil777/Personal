package com.kabi.dsa.recursion;

class Dice {
  public static void problem(String p, int up) {
    if (up == 0) {
      System.out.println(p);
      return;
    }
    for (int i = 1; i <= up; i++) {
      int current = up - i;
      char currentChar = (char) (i + '0');
      problem(p + currentChar, current);
    }
  }

  public static void main(String[] args) {
    problem("", 4);
  }
}
