package com.in28minutes.firstjavaproject;

public class MultiplicationTable {

  void print() {
    // 1번 방법
    print(5);
    // 2번 방법
    print(5, 1, 10);
  }

  void print(int table) {
    print(table, 1, 10);
  }

  void print(int table, int from, int to) {
    for (int i = from; i <= to; i++) {
      System.out.printf("%d * %d = %d", table, i, table * i).println();
    }
  }
}
