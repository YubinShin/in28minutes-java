package com.in28minutes.functionalprogramming;

import java.util.List;

// 함수는 일급시민이다
public class FunctinalProgrammingRunner {

  public static void main(String[] args) {
    List<String> list = List.of("Apple", "Bat", "Cat", "Dog");
    // printBasicWithFiltering(list);
    // printWithFPWithFiltering(list);

    List<Integer> numList = List.of(1, 4, 7, 9);
    exerciseOne(numList);
    exerciseTwo(numList);
  }

  private static void printBasic(List<String> list) {
    // 함수형 없이 객체지향으로 먼저 만들어보기
    for (String item : list) {
      System.out.println(item);
    }
  }

  private static void printBasicWithFiltering(List<String> list) {
    // 함수형 없이 객체지향으로 먼저 만들어보기
    for (String item : list) {
      if (item.endsWith("at")) System.out.println(item);
    }
  }

  private static void printWithFunctionalProgramming(List<String> list) {
    list
      .stream()
      .forEach(element -> System.out.println("element : " + element));
  }

  private static void printWithFPWithFiltering(List<String> list) {
    list
      .stream()
      .filter(element -> element.endsWith("at"))
      .forEach(element -> {
        System.out.println("element : " + element);
      });
  }

  public static void exerciseOne(List<Integer> list) {
    list
      .stream()
      .filter(element -> element % 2 == 1)
      .forEach(element -> {
        System.out.println("element : " + element);
      });
  }

  public static void exerciseTwo(List<Integer> list) {
    list
      .stream()
      .filter(element -> element % 2 == 0)
      .forEach(element -> {
        System.out.println("element : " + element);
      });
  }
}
// -> 람다 익스프레션 이라고 부릅니다.
/**
 * 1. list.stream() 이 뭘까여?
 *    list 를 Stream 으로 변환하고, forEach 를 이 안에 호출한 다음 각 요소들을 가지고 뭘할지 통과시켜주는거죠
 *
 * 2. forEach 안에 통과시키는건 뭘까여?
 *    데이터가 아닙니다. action 을 보내는 거에요!
 *    forEach 에 함수코드를 보내는겁니다.
 *    흐름의 각 요소마다 실행될 함수를 보내는거에요.
 */
// 함수형 프로그래밍에서 중요한 건 함수를 매개변수로서 또 다른 함수에 통과시킨 후 루프 시킬 수 있다는 겁니다.
// 루프 반복문 없이 실행이 됩니다.
// 이것이 작동하는 구조는 각 요소가 흐름되고 그리고 각 요소들에 대해 이 코드가 실행되는 거죠
/**
 *
 * 함수형 프로그래밍에선 우리가 직접 요소를 반복하고 그러는게 아니라,
 * 로직만 알려주는겁니다.
 */
