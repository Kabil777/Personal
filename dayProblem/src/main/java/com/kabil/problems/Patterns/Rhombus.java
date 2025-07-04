package com.kabil.problems.Patterns;

public class Rhombus {
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

  static void rhombus(int row, int column) {
    if (row > column) {
      return;
    }
    printSpace(column - row);
    printStar(column);
    System.out.println();
    rhombus(row + 1, column);
  }

  static void hollowRhombus(int row, int column) {
    if (row > column) {
      return;
    }
    printSpace(column - row);
    if (row == 1 || row == column) {
      printStar(column);
    } else {
      System.out.print("*");
      printSpace(column - 2);
      System.out.print("*");
    }

    System.out.println();
    hollowRhombus(row + 1, column);
  }

  public static void main(String[] args) {
    hollowRhombus(1, 5);
    System.out.println();
    rhombus(1, 5);
  }

}
