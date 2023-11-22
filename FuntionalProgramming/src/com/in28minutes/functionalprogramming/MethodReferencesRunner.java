package com.in28minutes.functionalprogramming;

import java.util.List;

public class MethodReferencesRunner {

  public static void print(int num) {
    System.out.println(num);
  }

  public static boolean isEven(Integer number) {
    return number % 2 == 0;
  }

  /** 메소드 참조 */
  public static void main(String[] args) {
    // 메소드 참조로 바꿀 수록 람다식보다 코드의 가독성이 좋아지죠?
    Integer max = List
      .of(23, 45, 67, 34)
      .stream()
      .filter(MethodReferencesRunner::isEven)
      .max(Integer::compare)
      .orElse(0);
    System.out.println(max);
  }

  private static void extracted() {
    List
      .of("Ant", "Bat", "Cat", "Dog", "Elephant")
      .stream()
      .map(s -> s.length())
      .forEach(s -> System.out.println(s));
  }

  private static void extracted2() {
    List
      .of("Ant", "Bat", "Cat", "Dog", "Elephant")
      .stream()
      .map(s -> s.length())
      .forEach(System.out::println);
    // System.out::println 메소드 참조라고 부른다.
    // s -> System.out.println(s) 에 대한 축약 표현
  }

  private static void extracted3() {
    // 특징1
    // 정적 메소드를 불러오는 경우.
    List
      .of("Ant", "Bat", "Cat", "Dog", "Elephant")
      .stream()
      .map(s -> s.length())
      .forEach(MethodReferencesRunner::print);
  }

  private static void extracted4() {
    // 특징2
    // 인스턴스 메소드도 메소드참조로 바꿀 수 있습니다.
    List
      .of("Ant", "Bat", "Cat", "Dog", "Elephant")
      .stream()
      .map(String::length)
      .forEach(System.out::println);
  }
}
