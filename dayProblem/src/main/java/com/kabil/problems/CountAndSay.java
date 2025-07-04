package com.kabil.problems;

class countAndSay {

  public static String helper(String p, String up, int count, int index) {
    if (up.isEmpty()) {
      return p;
    }
    if (up.length() == 1) {
      return "1" + up;
    }
    if (up.length() == index) {
      return p + count + up.charAt(index - 1);
    }
    if (up.charAt(index - 1) == up.charAt(index)) {
      return helper(p, up, count + 1, index + 1);
    }
    String n = Integer.toString(count) + up.charAt(index - 1);
    return helper(p + n, up, 1, index + 1);

  }

  public static String rleGenerator(int n) {
    String rle = "1";
    for (int i = 1; i < n; i++) {
      rle = helper("", rle, 1, 1);
    }
    return rle;
  }

  public static void main(String[] args) {
    rleGenerator(4);
  }

}
