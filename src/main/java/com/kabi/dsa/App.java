package com.kabi.dsa;

/**
 * Hello world!
 *
 */
public class App {
  public static int ref(int n) {
    return 10;
  }

  public static void main(String[] args) {
    System.out.println("Hello World!");
    int ans = ref(7);
    System.out.println(ans);
  }
}
