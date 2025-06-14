package com.kabi.dsa.recursion;

import java.util.ArrayList;

class PhoneProblem {
  public static ArrayList<String> problem(String p, String up) {
    if (up.isEmpty()) {
      ArrayList<String> str = new ArrayList<String>();
      str.add(p);
      if (str.isEmpty()) {
        return new ArrayList<>();
      }
      return str;
    }
    char current = up.charAt(0);
    ArrayList<String> list = new ArrayList<>();
    for (int i = 0; i < 3; i++) {
      list.addAll(problem(p + (char) ((current - '0' - 1) * 3 + i + 'a'), up.substring(1)));
    }
    return list;

    // problem(p + (char) (Integer.parseInt(current) + 'a'), up.substring(1));
  }

  public static void main(String[] args) {
    System.out.println();
    String s = "12";
    System.out.println(problem("", s));
  }
}
