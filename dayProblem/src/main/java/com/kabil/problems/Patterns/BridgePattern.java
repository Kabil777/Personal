package com.kabil.problems.Patterns;

public class BridgePattern {

  static void printSpace(int n) {
    if (n <= 0)
      return;
    System.out.print(" ");
    printSpace(n - 1);
  }

  static void printAlphabets(int n, int p, int m) {
    if (n > p)
      return;
    System.out.print((char) (m + 'A'));
    printAlphabets(n + 1, p, m + 1);
  }

  static void printAlphabetsRev(int n) {
    if (n < 0)
      return;
    System.out.print((char) (n + 'A'));
    printAlphabetsRev(n - 1);
  }

  static void printBridge(int row, int column) {
    if (row > column)
      return;
    printAlphabets(row, column, 0);
    printSpace(row);
    printSpace(row - 1);
    if (row == 0) {
      printAlphabetsRev(column - row - 1);
    } else {
      printAlphabetsRev(column - row);
    }
    System.out.println();
    printBridge(row + 1, column);
  }

  public static void main(String[] args) {
    System.out.println();
    printBridge(0, 4);
  }
}
