package com.in28minutes.functionalprogramming;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * 람다식이 실제로 작동하는 원리
 *
 * 람다식을 사용해 코드를 작성했을 때
 * 화면 뒤에서는 함수형 인터페이스를 실행하기 위한
 * 생성이 일어나고 있고, 실행에 대한 사례도 생성되고 있어요.
 *
 * filter
 *  Predicate 라는 인터페이스를 사용한다.
 *  Predicate 의 test 라는 메서드를 통과하냐 여부를 return 하는 것
 *  Predicate는 입력값을 보고 참인지 거짓인지를 판단합니다
 *
 *
 * forEach
 *  Consumer 라는 인터페이스를 사용한다.
 *  Consumer 의 accept 라는 메서드를 통과하는 값을 return 하는 것
 *  사용자가 어떤 값을 입력해 주고 그에 대한 소비를 진행하죠 그러므로 어떤 값도 반환되지 않습니다.
 *
 *
 * map
 *  Funtion 라는 인터페이스를 사용한다.
 *  Funtion 의 appy 라는 메서드를 통과한 결과를 return 하는 것
 *  Function은 함수형 인터페이스 중 하나로, 입력값을 얻고 어떤 값을 출력해내는 인터페이스를 뜻해요
 *  함수와 같이 작동하는 것이죠, 이해되었나요? 통상적으로 함수는 어떤 값을 입력하면 출력값을 내놓습니다
 *
 */
class EvenNumberPredicate implements Predicate<Integer> {

  public boolean test(Integer number) {
    return number % 2 == 0;
  }
}

class ForEachConsumer implements Consumer<Integer> {

  // forEach 를 사용하면 화면 뒤에서는 Consumer 인터페이스 안에 존재하는 accept 메소드가 실행됩니다.
  @Override
  public void accept(Integer number) {
    if (number != null) {
      System.out.println(number);
    }
  }
}/**
 * 당신이 하려는 것의 개념은 거의 맞지만,
 * Java의 Consumer 인터페이스에 대해 약간의 오해가 있습니다.
 * Consumer 인터페이스의 accept 메서드는 아무 것도 반환하지 않습니다
 * (반환 타입이 void입니다).
 * 이 메서드는 주어진 인자(이 경우 Integer)에 대한 연산을 수행하도록
 * 설계되었지만 값을 반환하도록 설계되지 않았습니다.
 */

class NumberSqureMapper implements Function<Integer, Integer> {

  @Override
  public Integer apply(Integer number) {
    return number * number;
  }
}

public class RamdaBehindTheScreenRunner {

  // 함수형 프로그래밍의 존재의의
  // 함수를 1급 시민(함수에 매개변수로 넣을수 있음)으로 만들기 위해
  // 1. 변수에 함수를 저장하려고
  // 2. 메서드에 함수를 전달하려고
  // 3. 메서드로부터 함수를 반환하려고
  public static void main(String[] args) {
    extracted();
    usePredicateAndConsumer();
  }

  private static void extracted() {
    // 1 번 경우 )  변수에 함수를 저장하려고
    Predicate<? super Integer> evenPredicate = createEvenPredicate();
    Predicate<? super Integer> oddPredicate = createOddPredicate();
    List
      .of(23, 43, 34, 45, 36, 48)
      .stream()
      .filter(evenPredicate) // 필터는 클래스의 형태인 predicate를 허용한다
      .forEach(e -> System.out.println(e));
  }

  private static Predicate<? super Integer> createOddPredicate() {
    return n -> n % 2 == 1; // 3번 경우)함수를 반환하고 있다
  }

  private static Predicate<? super Integer> createEvenPredicate() {
    return n -> n % 2 == 0;
  }

  public static void usePredicateAndConsumer() {
    List
      .of(23, 43, 34, 45, 36, 48)
      .stream()
      .filter(new EvenNumberPredicate()) // 필터는 클래스의 형태인 predicate를 허용한다
      .forEach(new ForEachConsumer());
  }

  public static void useMap() {
    List
      .of(23, 43, 34, 45, 36, 48)
      .stream()
      .map(new NumberSqureMapper())
      .forEach(new ForEachConsumer());
    //   <R> Stream<R> map(Function<? super T, ? extends R> var1);
    // function 인터페이스가 뭘까요?
    // function 에서는 입력값으로 한 객체(T)를 받고,
    // 다른객체를 출력값으로 보냅니다.
    // 여기서 하는 것들을 정리하면 apply 메서드에 대해서 정의하는 겁니다.
  }
}
/**
 * 람다식이 실제로 작동하는 원리
 *

 *
 */
// Stream<T> filter​(Predicate<? super T> predicate)
// Predicate 는 @Functional Interface
// boolean test(T t);
// 인터페이스의 실행에 대한 대상만 파라미터로써 실행이 가능합니다.
