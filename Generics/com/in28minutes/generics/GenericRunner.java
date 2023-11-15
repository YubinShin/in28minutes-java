package com.in28minutes.generics;

public class GenericRunner {

  public static void main(String[] args) {
    MyCustomList<String> list = new MyCustomList<>();
    list.addElement("Element 1");
    list.addElement("Element 2");

    // 만약 내가 integer를 리스트에 넣고 싶다면?
    MyCustomList<Integer> list2 = new MyCustomList<>();
    list2.addElement(Integer.valueOf(5));
    list2.addElement(Integer.valueOf(7));

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
 */
