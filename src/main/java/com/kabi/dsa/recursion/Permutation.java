package com.kabi.dsa.recursion;

class Permutation {
  public static void permutationFunc(String p, String up) {
    if (up.isEmpty()) {
      System.out.println(p);
      return;
    }
    char current = up.charAt(0);
    for (int i = 0; i <= p.length(); i++) {
      String before = p.substring(0, i);
      String after = p.substring(i, p.length());

      permutationFunc(before + current + after, up.substring(1));
    }

  }

  public static void main(String[] args) {
    // String s = "abc";
    // permutationFunc("", s);
  }
}
