package com.in28minutes.generics;

import java.util.ArrayList;

// 제네릭을 사용하려면 클래스이름에 괄호를 쳐주면 됩니다
public class MyCustomList<T> {

  ArrayList<T> list = new ArrayList<>();

  public void addElement(T element) {
    list.add(element);
  }

  public void removeElement(T element) {
    list.remove(element);
  }

  public String toString() {
    return list.toString();
  }
}
