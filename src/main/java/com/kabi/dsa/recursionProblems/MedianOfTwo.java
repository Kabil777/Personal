package com.kabi.dsa.recursionProblems;

import java.util.ArrayList;
import java.util.Arrays;

class MedianOfTwo {
  public static void helper(int[] array, int start, int end, int mid) {
    int array1Pointer = start;
    int array2Pointer = mid;
    int mixPointer = 0;

    int[] mix = new int[end - start];
    while (array1Pointer < mid && array2Pointer < end) {
      if (array[array1Pointer] > array[array2Pointer]) {
        mix[mixPointer] = array[array2Pointer];
        mixPointer++;
        array2Pointer++;
      } else {
        mix[mixPointer] = array[array1Pointer];
        mixPointer++;
        array1Pointer++;
      }
    }
    while (array1Pointer < mid) {
      mix[mixPointer] = array[array1Pointer];
      mixPointer++;
      array1Pointer++;
    }
    while (array2Pointer < end) {
      mix[mixPointer] = array[array2Pointer];
      mixPointer++;
      array2Pointer++;
    }
    for (int i = 0; i < mix.length; i++) {
      array[start + i] = mix[i];
    }
  }

  public static void merge(int[] array, int start, int end) {
    if (end - start <= 1) {
      return;
    }
    int mid = start + (end - start) / 2;
    merge(array, start, mid);
    merge(array, mid, end);

    helper(array, start, end, mid);
  }

  public static void main(String[] args) {
    int[] array = { 2, 1, 6, 3, 4 };
    merge(array, 0, array.length);
    System.out.println(Arrays.toString(array));

    int[] array1 = { 2, 1, 4 };
    int[] merged = new int[array.length + array1.length];
    System.arraycopy(array, 0, merged, 0, array.length);
    System.arraycopy(array1, 0, merged, array.length, array1.length);
    System.out.println(Arrays.toString(merged));
  }
}
