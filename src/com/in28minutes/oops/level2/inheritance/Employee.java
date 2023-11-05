package com.in28minutes.oops.level2.inheritance;

import java.math.BigDecimal;

public class Employee extends Person {

  private String title;
  private String employer;
  private char employeeGrade;
  private BigDecimal salary;

  public Employee(String name, String title) {
    // new Employee()를 호출하면 암시적 implicitly으로 super(); 가 호출됩니다.
    // constructor에서 super(); 를 호출하면 상위 클래스 생성자가 호출됩니다.

    // 상위 생성자를 쓰면서 다른 것도 추가하고 싶으면
    // 무조건 직접 super(); 로 상위 생성자를 호출해야합니다.
    super(name);
    this.title = title;
    System.out.println("Employee Constructor");
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getEmployer() {
    return employer;
  }

  public void setEmployer(String employer) {
    this.employer = employer;
  }

  public char getEmployeeGrade() {
    return employeeGrade;
  }

  public void setEmployeeGrade(char employeeGrade) {
    this.employeeGrade = employeeGrade;
  }

  public BigDecimal getSalary() {
    return salary;
  }

  public void setSalary(BigDecimal salary) {
    this.salary = salary;
  }

  public String toString() {
    String email = super.getEmail();
    String name = super.getName();
    String phoneNumber = super.getPhoneNumber();
    return (
      String.join(
        "\n❤️ : ",
        super.toString(),
        // name,
        // email,
        // phoneNumber,
        title,
        employer,
        Character.toString(employeeGrade)
      )
    );
  }
}
