package com.in28minutes.oops.level2.inheritance;

public class StudentRunner {

  public static void main(String[] args) {
    //Student student = new Student();
    // Person person = new Person();

    // person.setName("유빈");
    // person.setPhoneNumber("01012345678");
    // person.setEmail("shin.yubin18@gmail.com");

    // String value = person.toString();
    // System.out.println("person : " + person);
    // System.out.println("value : " + value);
    /** 모든 객체는 사실 무언가를 상속받고 있습니다.
     *
     * 클래스에 extends 가 붙어있지 않으면 모든 객체가 Object 클래스를 상속받습니다.
     */

    // Employee employee = new Employee(
    //   "김씨",
    //   "kim@gmail.com",
    //   "010-1234-5678",
    //   "연봉 1억을 원하는",
    //   "샘숭",
    //   'A',
    //   BigDecimal.valueOf(123)
    // );

    Employee employee = new Employee("신유빈", "사원");
    // Student student = new Student("학생신유빈");
    System.out.println(employee);
  }
}
/**
 *에러! 다중상속은 c++ 에선 되지만 자바에선 안됩니다.

 * class Animal{};
 *
 * class Pet{};
 *
 * class Dog extends Animal, Pet{
 *
 * }
 *
 * ------------------------------------------
 *
 * 하지만 연장 상속은 됩니다.
 * 상속계층 inheritance hierarchy
 * 
 * class Animal{};
 *
 * class Pet extends Animal{
 *  public void groom(){
      System.out.println("Groom");
 *  }
 * };
 *
 * class Dog extends Pet{};
 *
 * Pet pet = new Dog(); OK
 * Dog dog = new Pet(); ERROR
 * 
 * pet instanceOf Pet // true
 * pet instanceOf Dog // true
 */
