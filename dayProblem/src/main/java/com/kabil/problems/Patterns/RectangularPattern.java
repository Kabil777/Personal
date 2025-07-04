package com.kabil.problems.Patterns;

public class RectangularPattern {

  static void printStar(int n) {
    if (n <= 0)
      return;
    System.out.print("*");
    printStar(n - 1);
  }

  static void printSpace(int n) {
    if (n <= 0)
      return;
    System.out.print(" ");
    printSpace(n - 1);
  }

  static void hollowRectangle(int row, int bredth, int length) {
    if (row > length) {
      return;
    }
    if (row == 1 || row == length) {
      printStar(bredth);
    } else {
      System.out.print("*");
      printSpace(bredth - 2);
      System.out.print("*");
    }

    System.out.println();
    hollowRectangle(row + 1, bredth, length);
  }

  public static void main(String[] args) {
    hollowRectangle(1, 10, 5);
  }
}
