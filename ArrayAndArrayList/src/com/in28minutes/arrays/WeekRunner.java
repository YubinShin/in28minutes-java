package com.in28minutes.arrays;

public class WeekRunner {

  public static void main(String[] args) {
    Week week = new Week(
      "Sunday",
      "Monday",
      "Tuesday",
      "Wednesday",
      "Thursday",
      "Friday",
      "Saturday"
    );
    System.out.println(week.findLongestString());
    week.printBackWards();
  }
}
