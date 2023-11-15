package com.in28minutes.generics;

import java.util.ArrayList;

public class MyCustomList {

  ArrayList<String> list = new ArrayList<>();

  public void addElement(String element) {
    list.add(element);
  }

  public void removeElement(String element) {
    list.remove(element);
  }
}
