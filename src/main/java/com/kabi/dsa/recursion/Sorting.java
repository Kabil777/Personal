package com.kabi.dsa.recursion;

import java.util.Arrays;

public class Sorting {

  // bubble Sorting
  public static int[] bubble(int[] array, int start, int end) {
    if (start > end)
      return array;
    if (array[start] > array[start + 1]) {
      int maxVal = array[start];
      array[start] = array[start + 1];
      array[start + 1] = maxVal;
    }
    return bubble(array, start + 1, end);
  }

  // selection sort
  public static int[] selection(int[] array, int start, int end, int max) {
    if (end == 0) {
      return array;
    }
    if (start <= end) {
      if (array[start] > array[max]) {
        max = start;
      }
      return selection(array, start + 1, end, max);
    }

    int maxVal = array[max];
    array[max] = array[end];
    array[end] = maxVal;

    return selection(array, 0, end - 1, 0);
  }

  public static void merge(int[] array, int start, int end, int mid) {
    int arr1Pointer = start;
    int arr2Pointer = mid;
    int mixPointer = 0;

    int[] mix = new int[end - start];

    while (arr1Pointer < mid && arr2Pointer < end) {

      if (array[arr1Pointer] < array[arr2Pointer]) {
        mix[mixPointer] = array[arr1Pointer];
        arr1Pointer++;
        mixPointer++;
      } else {
        mix[mixPointer] = array[arr2Pointer];
        arr2Pointer++;
        mixPointer++;
      }

    }
    while (arr1Pointer < mid) {
      mix[mixPointer] = array[arr1Pointer];
      arr1Pointer++;
      mixPointer++;
    }
    while (arr2Pointer < end) {
      mix[mixPointer] = array[arr2Pointer];
      arr2Pointer++;
      mixPointer++;
    }

    for (int i = 0; i < mix.length; i++) {
      array[i + start] = mix[i];
    }
  }

  public static void mergeSort(int[] array, int start, int end) {
    if (end - start <= 1)
      return;

    int mid = start + (end - start) / 2;
    mergeSort(array, start, mid);
    mergeSort(array, mid, end);

    merge(array, start, end, mid);
  }

  public static void main(String[] args) {
    int[] array = { 2, 1, 3, 5, 4 };
    // System.out.println(Arrays.toString(selection(array, 0, array.length - 1,
    // 0)));
    mergeSort(array, 0, array.length);
    System.out.print(Arrays.toString(array));
  }

}
