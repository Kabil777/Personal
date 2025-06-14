package com.kabi.dsa.recursion.backtracking;

import java.lang.System.Logger.Level;
import java.util.ArrayList;

class Maze {
  public static void main(String[] args) {
    // System.out.println(pathCount(3, 3));
    System.out.println(pathTree("", 3, 3));
  }

  public static int pathCount(int row, int coloumn) {
    if (row == 1 || coloumn == 1) {
      return 1;
    }
    int left = pathCount(row - 1, coloumn);
    int right = pathCount(row, coloumn - 1);
    return left + right;
  }

  public static ArrayList<String> pathTree(String p, int row, int coloumn) {
    if (row == 1 || coloumn == 1) {
      ArrayList<String> str = new ArrayList<>();
      str.add(p);
      return str;
    }
    ArrayList<String> ans = new ArrayList<>();
    ArrayList<String> left = new ArrayList<>();
    ArrayList<String> right = new ArrayList<>();

    if (row > 1) {
      left = pathTree(p + "R", row - 1, coloumn);
    }
    right = pathTree(p + "D", row, coloumn - 1);
    ans.addAll(left);
    ans.addAll(right);
    return ans;
  }
}
