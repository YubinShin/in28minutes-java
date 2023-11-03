package com.in28minutes.arrays;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

public class Student {

  private String name;
  private ArrayList<Integer> marks = new ArrayList<Integer>();

  // Student(String name, int[] marks) {
  //   this.name = name;
  //   this.marks = marks;
  // }

  //  variable argument concept comes in
  Student(String name, int... marks) {
    this.name = name;
    for (int mark : marks) {
      this.marks.add(mark);
    }
  }

  public int getNumberOfmarks() {
    return marks.size();
  }

  public int getTotalSumOfMarks() {
    int result = 0;
    for (int mark : marks) {
      result += mark;
    }
    return result;
  }

  public int getMaximumMark() {
    return Collections.max(marks);
  }

  public int getMinimumMark() {
    return Collections.min(marks);
  }

  public BigDecimal getAverageMarks() {
    BigDecimal num1 = BigDecimal.valueOf(getTotalSumOfMarks());
    BigDecimal num2 = BigDecimal.valueOf(marks.size());
    return num1.divide(num2, 3, RoundingMode.UP); // 허거덩 근데 자바9 부터 Deprecated 됐다고 한다.
  }

  public void addMark(int i) {
    marks.add(i);
  }

  public void removeMarkAtIndex(int i) {
    marks.remove(i);
  }

  public String getName() {
    return name;
  }

  public String getMarks() {
    return marks.toString();
  }
  // 배열은 한번 생성하고 나면 크기가 처음에 정해진다. 이 크기를 변경할 수 없다.
  // 유일한 옵션은 원래 요소들을 복사한 뒤에 새로운 배열을 만드는 것이다.
  // 배열에 요소를 추가하거나 삭제하는 건 매우매우 어려운 일이다.
  // 자바에 ArrayList라고 하는게 있는데 이게 조금 도움이 될 수도 있습니다
  // ArrayList에 대한 소개는 다음 시간에 해보도록 할게요
  // 본 영상에서는 배열의 길이를 직접 늘이거나 줄일 수 없다는 문제에 대해 이해하는 시간을 가졌고,
  // 다음 영상에서는 ArrayList에 집중해 보겠습니다

  // public void addMark(int i) {
  //   int[] newMarks = new int[marks.length + 1];
  //   marks = newMarks;
  // }

  // public void removeMarkAtIndex(int i) {
  //   int[] newMarks = new int[marks.length - 1];
  //   marks = newMarks;
  // }

}
