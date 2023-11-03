package com.in28minutes.arrays;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Student {

  private String name;
  private int[] marks = {};

  // Student(String name, int[] marks) {
  //   this.name = name;
  //   this.marks = marks;
  // }

  //  variable argument concept comes in
  Student(String name, int... marks) {
    this.name = name;
    this.marks = marks;
  }

  public int getNumberOfmarks() {
    return marks.length;
  }

  public int getTotalSumOfMarks() {
    int result = 0;
    for (int mark : marks) {
      result += mark;
    }
    return result;
  }

  public int getMaximumMark() {
    int maximum = Integer.MIN_VALUE;
    for (int mark : marks) {
      if (maximum < mark) {
        maximum = mark;
      }
    }
    return maximum;
    // Arrays.sort(marks);
    // return marks[marks.length - 1];
  }

  public int getMinimumMark() {
    int minimum = Integer.MAX_VALUE;
    for (int mark : marks) {
      if (minimum > mark) {
        minimum = mark;
      }
    }
    return minimum;
    // Arrays.sort(marks);
    // return marks[0];
  }

  public BigDecimal getAverageMarks() {
    BigDecimal num1 = BigDecimal.valueOf(getTotalSumOfMarks());
    BigDecimal num2 = BigDecimal.valueOf(marks.length);
    return num1.divide(num2, 3, RoundingMode.UP); // 허거덩 근데 자바9 부터 Deprecated 됐다고 한다.
  }

  public void addMark(int i) {}

  public void removeMarkAtIndex(int i) {}
}
