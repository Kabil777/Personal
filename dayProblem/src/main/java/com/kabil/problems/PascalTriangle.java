package com.kabil.problems;

import java.util.ArrayList;

public class PascalTriangle {

  ArrayList<Integer> nthRowOfPascalTriangle(int n) {

    ArrayList<ArrayList<Integer>> list = new ArrayList<>();

    for (int i = 0; i < n; i++) {
      ArrayList<Integer> l = new ArrayList<>();
      for (int j = 0; j <= i; j++) {
        if (j == 0 || j == i) {
          l.add(1);
        } else {
          l.add(list.get(i - 1).get(j - 1) + list.get(i - 1).get(j));
        }
      }
      list.add(l);
    }
    return list.get(list.size() - 1);
  }
}
