package com.kabil;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Hello world!
 */
public class Difference {
  static void sort(int[] array) {
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array.length - 1; j++) {
        if (array[i] < array[j]) {
          int temp = array[i];
          array[i] = array[j];
          array[j] = temp;
        }
      }
    }
  }

  public static void main(String[] args) {
    int[] array = { 55, 44, 33, 22, 11 };
    sort(array);

    System.out.println("\n" + Arrays.toString(array));
    ArrayList<Integer> pairs = new ArrayList<Integer>();
    ArrayList<Integer> differnece = new ArrayList<>();

    for (int i = 0; i < array.length - 1; i++) {
      int current = array[i];
      int next = array[i + 1];
      differnece.add(next - current);
      pairs.add(next);
      pairs.add(current);
    }

    pairs.sort((a, b) -> {
      return a - b;
    });

    int dif1 = differnece.indexOf(0);
    int dif2 = differnece.indexOf(1);
    if (dif1 == dif2) {
      for (int list : pairs) {
        System.out.print(list + " ");
      }
      System.out.print("\nDifference: " + differnece.get(0) + "\n");

    } else {
      System.out.println("Difference: " + dif1);
    }
  }
}
