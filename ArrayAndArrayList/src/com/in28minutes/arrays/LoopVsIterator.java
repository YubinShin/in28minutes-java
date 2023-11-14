package com.in28minutes.arrays;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LoopVsIterator { // 클래스 이름 변경

  public static void main(String[] args) {
    List<String> words = List.of("Apple", "Bat", "Cat");

    ArrayList<String> wordsAl = new ArrayList<>(words);
    System.out.println(wordsAl);
    Iterator<String> iterator = wordsAl.iterator();

    while (iterator.hasNext()) {
      if (iterator.next().endsWith("at")) {
        iterator.remove();
      }
    }
    System.out.println(wordsAl);
  }
}
