package com.in28minutes.oops.level2.inheritance;

/** Person 은 super 클래스, Student 는 subclass 라고 부릅니다
 *
 * 하지만 상속이 무조건 좋진 않습니다.
 *
 * 상속은 IS A 관계라고 부릅니다.
 *
 * Student is a person 이라는 의미죠. 둘이 관계가 없으면 상속하지 않는 걸 추천합니다.
 */

public class Student extends Person {

  String colleageName;
  int year;

  public Student(String name) {
    super(name);
  }

  public String getColleageName() {
    return colleageName;
  }

  public void setColleageName(String colleageName) {
    this.colleageName = colleageName;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }
}
