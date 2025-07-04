package com.kabil.problems.Patterns;

public class InvertedTriangle {

  static void printStars(int n) {
    if (n <= 0)
      return;
    System.out.print(" *");
    printStars(n - 1);
  }

  static void printSpaces(int n) {
    if (n <= 0)
      return;
    System.out.print("  ");
    printSpaces(n - 1);
  }

  static void invert(int row, int column) {
    if (row > column)
      return;
    printSpaces(row - 1);
    printStars(2 * (column - row) + 1);
    System.out.println();
    invert(row + 1, column);
  }

  public static void main(String[] args) {
    System.out.println();
    invert(1, 5);
  }
}
