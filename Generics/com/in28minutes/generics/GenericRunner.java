package com.in28minutes.generics;

public class GenericRunner {

  public static void main(String[] args) {
    MyCustomList list = new MyCustomList();
    list.addElement("Element 1");
    list.addElement("Element 2");

    // 만약 내가 integer를 리스트에 넣고 싶다면?
    MyCustomList list2 = new MyCustomList();
    list2.addElement(Integer.valueOf(5));
    list2.addElement(Integer.valueOf(7));
  }
}
