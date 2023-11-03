package com.in28minutes.arrays;

import java.math.BigDecimal;

public class StudentRunner {

  public static void main(String[] args) {
    // int[] marks = { 75, 60, 56 };

    Student student = new Student("name", 75, 60, 56);
    int number = student.getNumberOfmarks();
    int sum = student.getTotalSumOfMarks();
    int maximumMark = student.getMaximumMark();
    int minimumMark = student.getMaximumMark();
    BigDecimal average = student.getAverageMarks();
    student.addMark(35);
    student.removeMarkAtIndex(0);
    System.out.println(student.getMarks());
  }
}
