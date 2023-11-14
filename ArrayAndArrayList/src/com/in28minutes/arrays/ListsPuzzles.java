package com.in28minutes.arrays;

import java.util.ArrayList;
import java.util.List;

public class ListsPuzzles {

  public static void main(String[] args) {
    beGeneralization();
  }

  /**
   * 1.  List<String>이라 하면 이 안에 문자열 값들만 저장할 수 있다.
   * 2. 리스트 안에는 기초 요소를 저장할 수 없다. 모든것은 오토복싱이 되죠.
   */

  public static void nonGeneralization() {
    List value = List.of("A", 'A', 1, 1.0);
    System.out.println(value.get(2)); // 1
    System.out.println(value.get(2) instanceof Integer); // true
    System.out.println(value.get(1) instanceof Character); // true
    System.out.println(value.get(3) instanceof Double); // true
    /** 1 은 int이지 Integer 가 아닌데 true 가 나오네요. 왤까요?
     *
     * 중요한 것 중 하나는, List 안에는 primitive type 을 담을 수 없다는 것입니다.
     * 그런데 'A', 1, 1.0 은 원시자료형인데 저장이 되네요.
     *
     * 우린 저번에 래퍼 클래스를 배울 때 Auto Boxing 을 배웠습니다.
     * 리스트를 만들려 할 때 일어나는 일은 ,
     * 요소들이 다 오토복싱되어 래퍼 클래스가 생성된다는 것입니다.
     */
  }

  public static void beGeneralization() {
    List<Integer> numbers = List.of(101, 102, 103, 104, 105);
    System.out.println(numbers.indexOf(101));
    List<Integer> numbersAl = new ArrayList<>(numbers);
    System.out.println(numbersAl.indexOf(101));
    /**
     *
     * numbersAl.remove(101); 인덱스가 범위밖에 있다는 말을 합니다.
     * Exception in thread "main" java.lang.IndexOutOfBoundsException: Index 101 out of bounds for length 5
     *
     * 안 되는 이유는 101 은 Integer 로 auto boxing 되었기 때문에 2 번 메서드를 써서 그렇습니다.
     *
     * Signatures:
     * boolean List<E>.remove(Object) // 1
     * E List<E>.remove(int) // 2
     * */

    // numbersAl.remove(numbersAl.indexOf(101));
    numbersAl.remove(Integer.valueOf(101)); // Integer 로 Auto boxing 해서 매개변수로 넣는다
    System.out.println(numbersAl);
  }
}
