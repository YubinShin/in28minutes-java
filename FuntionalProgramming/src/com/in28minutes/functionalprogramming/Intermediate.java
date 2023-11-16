package com.in28minutes.functionalprogramming;

import java.util.List;

public class Intermediate {

  /**
   * 중간연산
   *
   * 스트림에 실행할 수 있는 중간 연산은 여러개이다. (종단 연산은 마지막 하나뿐)
   * 정렬, 중복제거, 매핑 등 */
  public static void main(String[] args) {
    List<Integer> numbers = List.of(3, 5, 8, 213, 45, 4, 7);
    /** stream 을 정렬하면, 또 다른 스트림이 나옵니다. */

    numbers.stream().sorted().forEach(e -> System.out.println(e));

    List<Integer> repeatedNumbers = List.of(3, 5, 8, 213, 45, 5, 7);
    repeatedNumbers.stream().distinct().forEach(e -> System.out.println(e));

    List<Integer> beMappedNumbers = List.of(3, 5, 8, 213, 45, 5, 7);
    beMappedNumbers
      .stream()
      .distinct()
      .map(e -> e * e)
      .forEach(e -> System.out.println(e));
  }
}
