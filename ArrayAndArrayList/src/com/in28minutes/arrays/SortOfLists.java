package com.in28minutes.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortOfLists {

  public static void main(String[] args) {
    List<Integer> numbers = List.of(123, 12, 3, 5);
    // 정렬을 하고 싶다면 ArrayList 를 만들어야합니다.
    // 왜냐면 그냥 List 는 불변적 리스트니까요~

    List<Integer> numbersAl = new ArrayList<>(numbers);
    // numbersAl.sort();
    // Comparator

    Collections.sort(numbersAl); // Collections.sort()는 static 메서드 입니다.
    System.out.println(numbersAl);
  }
}
