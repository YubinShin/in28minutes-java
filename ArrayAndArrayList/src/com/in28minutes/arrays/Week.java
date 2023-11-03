package com.in28minutes.arrays;

public class Week {

  private String[] daysOfWeek = {};

  Week(String... args) {
    this.daysOfWeek = args;
  }

  public String findLongestString() {
    String result = "";
    for (int i = 0; i < daysOfWeek.length; i++) {
      if (daysOfWeek[i].length() > result.length()) {
        result = daysOfWeek[i];
      }
    }
    return result;
  }

  public void printBackWards() {
    for (int i = daysOfWeek.length - 1; i >= 0; i--) {
      System.out.println(daysOfWeek[i]);
    }
  }
}
