package com.kabil.problems;

import java.util.ArrayList;

public class Searchpattern {

  static ArrayList<Integer> find(String up, String p, int index, ArrayList<Integer> list) {
    if (index > up.length() - p.length()) {
      return list;
    }
    String s = up.substring(index, index + p.length());

    if (p.equals(s)) {
      list.add(index + 1);
    }
    return find(up, p, index + 1, list);
  }

  public static void main(String[] args) {

    String S = "batmanandrobinarebat";
    String pat = "bat";
    ArrayList<Integer> a = find(S, pat, 0, new ArrayList<>());
    System.out.print(a);
  }
}
