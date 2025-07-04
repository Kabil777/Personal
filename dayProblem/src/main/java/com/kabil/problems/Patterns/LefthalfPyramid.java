package com.kabil.problems.Patterns;

public class LefthalfPyramid {

  static void printStars(int n) {
    if (n <= 0) {
      return;
    }
    System.out.print("*");
    printStars(n - 1);
  }

  static void printSpaces(int n) {
    if (n <= 0) {
      return;
    }
    System.out.print(" ");
    printSpaces(n - 1);
  }

  static void leftTriangle(int row, int column) {
    if (row > column) {
      return;
    }
    printSpaces(column - row);
    printStars(row);

    System.out.println();
    leftTriangle(row + 1, column);
  }

  public static void main(String[] args) {
    System.out.println();
    leftTriangle(1, 5);
  }
}
