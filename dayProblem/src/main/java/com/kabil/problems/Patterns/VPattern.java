package com.kabil.problems.Patterns;

public class VPattern {

  static void printSpace(int n) {
    if (n <= 0)
      return;
    System.out.print(" ");
    printSpace(n - 1);
  }

  static void printInvertedV(int row, int column) {
    if (row > column)
      return;
    printSpace(column - row);
    System.out.print((char) ((column - row) + 'A'));
    printSpace(row - 1);
    printSpace(row - 2);
    if (row != 1) {

      System.out.print((char) ((column - row) + 'A'));
    }
    System.out.println();
    printInvertedV(row + 1, column);
  }

  static void printV(int row, int column) {
    if (row > column)
      return;
    printSpace(row - 1);
    System.out.print((char) ((column - row) + 'A'));
    printSpace(2 * (column - row) - 1);
    if (row != column) {
      System.out.print((char) ((column - row) + 'A'));
    }
    System.out.println();
    printV(row + 1, column);
  }

  public static void main(String[] args) {
    printInvertedV(1, 7);
    System.out.println();
    printV(1, 7);
  }
}
