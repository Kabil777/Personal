package com.kabil;

public class BinaryPattern {

  static void pattern(int row, int coloum, String p) {
    if (row == coloum) {
      return;
    }
    if (coloum % 2 == 0)
      p += "1";
    else
      p += "0";

    System.out.println(p);
    pattern(row, coloum + 1, p);
  }

  public static void main(String[] args) {
    System.out.println();
    pattern(4, 0, "");
  }
}
