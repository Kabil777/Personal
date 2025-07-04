package com.kabil.problems.Patterns;

public class RightHalfPyramid {

  public static void rightPyramid(int row, int column) {
    if (row == column) {
      return;
    }
    for (int i = 0; i <= column; i++) {
      System.out.print("*");
    }
    System.out.println();
    rightPyramid(row, column + 1);
  }

  public static void main(String[] args) {
    rightPyramid(5, 0);
  }
}
