package com.in28minutes.functionalprogramming;

import java.util.List;

public class FPNumberRunner {

  /** 함수형과 절차지향의 차이
   *
   * 절차지향 에서는 return 할때 sum 이라는 변수가 필요하다.
   * Sum 을 처음에 0 으로 초기화하고, for 문을 돌 때마다 변수의 값이 계속 바뀐다.
   * 이걸 Mutations(변이)라고 부른다.
   * 절차 지향에서는 뭘할지(sum) 뿐만아니라 하는 방법에 대해서(for문)도 말하고 있다.
   * EX) "지역변수를 만들고, 각 숫자를 더하고, 변수에 일시적으로 저장하고, 마지막으로 값을 리턴해라"
   *
   * 함수형에서는 return 할때 sum 이라는 변수가 필요 없다.
   * 지역변수나 루프사용법을 신경 쓸 필요가 없다.
   * 1. 함수형 프로그래밍에서는 변수 변이를 피한다. 즉, 값이 변하는 변수를 굳이 넣지 않는 것이다.
   * 2. 어떻게 하는지를 알려주지 않고, 뭘할지만 알려준다. EX를 우리가 굳이 짜 줄 필요가 없다.
   */
  public static void main(String[] args) {
    List<Integer> numbers = List.of(4, 6, 8, 13, 3, 15);
    sumOfNumberBasic(numbers);
    sumOfNumberFP(numbers);
    sumOfOddNumberFP(numbers);
  }

  public static void sumOfNumberBasic(List<Integer> numbers) {
    int sum = 0;
    for (Integer item : numbers) {
      sum += item;
    }
    System.out.println(sum);
  }

  public static int sumOfNumberFP(List<Integer> numbers) {
    // 2개의 매개변수가 있을땐 괄호가 있어야하기 때문에  (number1, number2) 에 괄호를 감싼겁니다.
    // 첫번째 매개변수 : 초기값
    return numbers.stream().reduce(0, (number1, number2) -> number1 + number2);
  }

  public static int sumOfOddNumberFP(List<Integer> numbers) {
    return numbers
      .stream()
      .filter(element -> element % 2 == 1)
      .reduce(
        0,
        (number1, number2) -> {
          System.out.printf("%d %d", number1, number2).println();
          return number1 + number2;
        }
      );
  }
}
/**
 *
 * 1. 함수형 프로그래밍이란 함수에게 일등 지위를 주는겁니다
 *   First Class Citizen 일등 시민
 *   일등지위란 다른 함수의 매개변수로 들어갈 수 있는 지위를 말합니다.
 *
 * 2. 변수의 상태변이가 없습니다.
 *
 * 3. 어떻게 할지가 아니라 뭘 할지에 포커스를 맞춘겁니다.
 *
 */
/**
 *
 *
 * 함수형 프로그래밍에서 많이 쓰이는 단어
 *
 * 1. 람다 표현식
 *    그저 단축표현식입니다.
 *    장점1 : 간단한 코드면 괄호{} 없이 쓸 수 있다.
 *
 * 2. 스트림
 *
 *    스트림은 객체의 소스입니다.
 *    문자열 스트림, 객체 스트림, 숫자 스트림 등등
 *    스트림에는 연산이 크게 두개 있습니다.
 *
 *    intermediate operation : 중간 연산 filter, map, sort, distinct
 *    > 연산결과는 다른 스트림이 된다.
 *
 *    terminal operation : 종단 연산 > forEach, reduce / consume(minimum, max, sum)
 *    > 연산을 처리하고 그 연산결과를 소모(process, consume)합니다.
 *    > 즉, 여러개의 스트림을 입력값으로 받아 하나의 결과로 줄이는 겁니다.
 */
