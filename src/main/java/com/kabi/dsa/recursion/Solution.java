package com.kabi.dsa.recursion;

import java.util.Arrays;
import java.util.LinkedList;

class Solution {
  public static LinkedList<Integer> array = new LinkedList<>();

  public static LinkedList<Integer> twoSum(LinkedList<Integer> l1, LinkedList<Integer> l2, int carry) {
    if (l1.isEmpty()) {
      return array;
    }
    int sum = l1.removeLast() + l2.removeLast() + carry;
    if (sum >= 10) {
      carry = sum / 10;
      array.add(sum % 10);
    } else {
      carry = 0;
      array.add(sum);
    }
    return twoSum(l1, l2, carry);
  }

  public static LinkedList<Integer> addTwoNumbers(LinkedList<Integer> l1, LinkedList<Integer> l2) {
    return twoSum(l1, l2, 0);
  }

  public static void main(String[] args) {
    LinkedList<Integer> l1 = new LinkedList<>(Arrays.asList(1, 2, 3, 4));
    LinkedList<Integer> l2 = new LinkedList<>(Arrays.asList(1, 2, 3, 9));
    System.out.println(addTwoNumbers(l1, l2));
  }
}
