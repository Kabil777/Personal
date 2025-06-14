package com.kabi.dsa.recursionProblems;

import java.util.ArrayList;
import java.util.Arrays;

class SumTriangle {

  public static ArrayList<Integer> triangleSum(ArrayList<Integer> array, int n) {
    if (n == 1) {
      return array;
    }
    ArrayList<Integer> arrayRet = new ArrayList<>();
    int i = 0;
    while (i < n - 1) {
      arrayRet.add(array.get(i) + array.get(i + 1));
      i++;
    }
    System.out.println(arrayRet);
    return triangleSum(arrayRet, n - 1);
  }

  public static char upper(char[] str, int s, int e) {
    if (s > e) {
      return '!';
    }
    if (Character.isUpperCase(str[s])) {
      return str[s];
    }
    return upper(str, s + 1, e);
  }

  public static void main(String[] args) {
    int[] array = { 1, 2, 3, 4, 5 };
    // ArrayList<Integer> arrayL = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
    // // System.out.println(triangleSum(arrayL, array.length));
    // String s = "huifgre";
    // System.out.println(upper(s.toCharArray(), 0, s.length()));
    System.out.println(Math.log(16) / Math.log(2));
  }
}
