package com.kabil.problems.Patterns;

public class TriangularAlphabets {

  static void printAlphabets(int n, int c, int p) {
    if (n <= c)
      return;
    System.out.print((char) (p + 'A') + " ");
    printAlphabets(n, c + 1, p + 1);
  }

  static void triangularAlphabets(int row, int column) {
    if (row > column)
      return;
    printAlphabets(column - row, 0, row);
    System.out.println();
    triangularAlphabets(row + 1, column);
  }

  public static void main(String[] args) {
    triangularAlphabets(0, 5);
  }
}
