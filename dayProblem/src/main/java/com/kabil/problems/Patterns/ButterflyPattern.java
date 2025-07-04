package com.kabil.problems.Patterns;

public class ButterflyPattern {

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

  public static void printButterfly(int row, int column) {
    if (row > column - 1) {
      printStar(2 * column - 1);
      return;
    }
    printStar(row);
    printSpace(column - row);
    printSpace(column - row - 1);
    printStar(row);
    System.out.println();
    printButterfly(row + 1, column);
  }

  public static void printButterflyBottom(int row, int column) {
    if (row > column - 1) {
      return;
    }
    printStar(column - row);
    printSpace(row);
    printSpace(row - 1);
    printStar(column - row);
    System.out.println();
    printButterflyBottom(row + 1, column);
  }

  public static void main(String[] args) {
    printButterfly(1, 5);
    System.out.println();
    printButterflyBottom(1, 5);
  }
}
