package com.in28minutes.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericRunner {

  static <X> X doubleValue(X value) {
    return value;
  }

  static <X extends List> void duplicate(X list) {
    list.addAll(list);
  }

  /** Upper bounded Wildcard
   * Number를 연장하는 타입이면 다 쓸수 있다*/
  static double sumOfNumberList(List<? extends Number> numbers) {
    double sum = 0.0;
    for (Number number : numbers) {
      sum += number.doubleValue();
    }
    return sum;
  }

  /** Lower bounded Wildcard
   * Number를 담는 클래스 타입이면 다 쓸수 있다*/
  static void addCoupleOfValues(List<? super Number> numbers) {
    numbers.add(1);
    numbers.add(1.0);
    numbers.add(1.0f);
    numbers.add(1l);
  }

  public static void main(String[] args) {
    /** Upper bounded Wildcard
     * 상한 관계 와일드카드
     */
    System.out.println(
      "sumOfNumberList :" + sumOfNumberList(List.of(1, 2, 3, 4, 5))
    );
    System.out.println(
      "sumOfNumberList :" + sumOfNumberList(List.of(1.1, 2.1, 3.1, 4.1, 5.1))
    );
    System.out.println(
      "sumOfNumberList :" + sumOfNumberList(List.of(1l, 2l, 3l, 4l, 5l))
    );

    /** Lower bounded Wildcard
     * 하한 관계 와일드카드
     */
    List<Number> emptyList = new ArrayList<>();
    addCoupleOfValues(emptyList);
    System.out.println("addCoupleOfValues :" + emptyList);

    MyCustomList<String> list = new MyCustomList<>();
    list.addElement("Element 1");
    list.addElement("Element 2");
    String value = list.get(0);

    MyCustomList<Integer> list2 = new MyCustomList<>();
    list2.addElement(Integer.valueOf(5));
    list2.addElement(Integer.valueOf(7));
    Integer number = list2.get(0);

    System.out.println(list);
    System.out.println(list2);
  }
}
/**
 * 사실, ArrayList가 어떻게 구현되는지 보시면, 완벽히 똑같은 방식입니다 그래서, 만약 여러분이 ArrayList로 가시면
 * java.util.arrayList, 컨트롤+시프트+T 를 눌러서 가시면, 이들은 여기에 E를 사용하는 것을 보실 수 있죠
 * 그리고 모든 메소드들을 보면, add 메소드를 찾아봅시다, 보시다피시 add(E)죠
 * 종류가 E, add(E), E가 이들이 쓰는 것입니다
 * 그것이 정확히 여기에서 T라고 특정하는 것이죠
 *
 * 선생님은 Type 의 약자라서 T라고 쓰는걸 선호한다고 한다.
 *
 *
 * 여기서 보통 쓰이는 명명 규칙은 항상 대문자를 쓰는것이죠, 그리고 만약
 * 여러분이 더 자세히 확장하고 싶다면
 * 최고의 방법은, 만약 우클릭을 하면, 이클립스에서 Refactor: Rename를 눌러 TYPE이라고 할수 있죠
 * 자, 모두 대문자여야 합니다
 * 자, 이것이 특정 종류라는 것을 표시하기 위해서죠
 * 만약 한 종류만 사용되고 있으면, 그냥 T 단 한글자를 사용하는 것을 선호합니다
 *
 *
 * 가장 흔히 쓰는 제네릭은 타입선언 할때 제네릭
 * 두번째로는 메서드에 쓰는 제네릭
 * 세번째로는 잘안쓰이지만 알아두면 좋은 와일드카드 제네릭
 */
