package com.kabi.dsa.recursionProblems;

import java.util.function.BinaryOperator;

class MinAndMax {
  static int[] array1 = new int[2];

  public static int[] minMax(int[] array, int start, int end, int max, int min) {
    if (start > end) {
      array1[0] = min;
      array1[1] = max;
      return array1;
    }
    if (max >= array[start]) {
      max = array[start];
    } else {
      min = array[start];
    }
    return minMax(array, start + 1, end, max, min);
  }

  public static int bin(int[] array, int s, int e, int t) {
    int mid = s + (e - s) / 2;
    if (array[mid] == t) {
      return mid;
    }
    if (array[mid] > t) {
      return bin(array, s, mid - 1, t);
    }
    return bin(array, mid + 1, e, t);
  }

  public static void main(String[] args) {
    int[] array = { 1, 2, 3, 4 };
    System.out.println(bin(array, 0, array.length - 1, 3));
    // int[] arr = minMax(array, 0, array.length - 1, array[0], array[0]);
    // for (int i : arr) {
    // System.out.println(i);
    // }
  }
}
