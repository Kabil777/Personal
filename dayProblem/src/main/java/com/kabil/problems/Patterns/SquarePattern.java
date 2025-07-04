package com.kabil.problems.Patterns;

public class SquarePattern {

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

  static void square(int row, int column) {
    if (row > column) {
      return;
    }
    printStar(column);
    System.out.println();
    square(row + 1, column);
  }

  static void hollowSquare(int row, int column) {
    if (row > column) {
      return;
    }
    if (row == 1 || row == column) {
      printStar(column);
    } else {
      System.out.print("*");
      printSpace(column - 2);
      System.out.print("*");
    }

    System.out.println();
    hollowSquare(row + 1, column);
  }

  public static void main(String[] args) {
    hollowSquare(1, 5);
    System.out.println();
    square(1, 5);
  }
}
