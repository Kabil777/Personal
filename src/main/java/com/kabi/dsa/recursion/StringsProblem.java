package com.kabi.dsa.recursion;

import java.util.ArrayList;
import java.util.LinkedList;

class StringsProblem {
  public static String skipCharacter(char[] str, int start, int end, char target) {
    if (start == end)
      return "";
    if (str[start] == target) {
      return skipCharacter(str, start + 1, end, target);
    }
    return str[start] + skipCharacter(str, start + 1, end, target);
  }

  public static void subSequence(String input, String output) {
    if (input.isEmpty()) {
      System.out.println(output);
      return;
    }
    char current = input.charAt(0);
    subSequence(input.substring(1), output + current);
    subSequence(input.substring(1), output);
  }

  public static void main(String[] args) {
    // String str = "kkhhttgg";
    // System.out.println(skipCharacter(str.toCharArray(), 0, str.length(), 'g'));
    subSequence("abc", "");
    LinkedList<Integer> ll = new LinkedList<>();
    ll.add(2);
    ll.remove(0);
    ArrayList<Integer> aee;
  }
}
