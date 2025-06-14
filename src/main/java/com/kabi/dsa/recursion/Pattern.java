package com.kabi.dsa.recursion;

public class Pattern {

  public static void star(int n) {
    if (n == 0)
      return;
    /*
     * use "* " for equilateral triangle"
     * use "*" for equilateral triangle"
     */
    System.out.print("*");
    star(n - 1);
  }

  public static void space(int n) {
    if (n == 0) {
      return;
    }
    System.out.print(" ");
    space(n - 1);
  }

  public static void invTriangle(int coloum) {
    if (coloum == 0) {
      return;
    }
    star(coloum);
    System.out.println();
    invTriangle(coloum - 1);

  }

  public static void triangle(int row, int coloum) {

    if (row == coloum) {
      return;
    }
    star(row);
    space(coloum - row - 1);
    space(coloum - row);
    star(row);
    System.out.println();
    triangle(row + 1, coloum);
  }

  public static void main(String[] args) {
    System.out.println();
    triangle(1, 5);
    invTriangle(5);
  }
}
