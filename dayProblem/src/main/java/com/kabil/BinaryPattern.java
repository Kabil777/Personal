package com.kabil;

public class BinaryPattern {

  static void pattern(int row, int coloum, int start) {
    if (row == coloum) {
      return;
    }
    for (int i = 0; i <= coloum; i++) {
      System.out.print(start);
      if (start == 0)
        start = 1;
      else
        start = 0;
    }
    System.out.println();
    pattern(row, coloum + 1, start);
  }

  public static void main(String[] args) {
    System.out.println();
    pattern(4, 0, 0);
  }
}
