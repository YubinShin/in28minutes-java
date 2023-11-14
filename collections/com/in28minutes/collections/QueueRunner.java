package com.in28minutes.collections;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueRunner {

  public static void main(String[] args) {
    lengthOrder();
  }

  public static void naturalOrder() {
    Queue<String> queue = new PriorityQueue<>();
    queue.addAll(List.of("Zebra", "Monkey", "Cat"));
    System.out.println(queue.poll());
    System.out.println(queue.poll());
    System.out.println(queue.poll());
  }

  public static void lengthOrder() {
    // 생성자에 Comparator 를 넣으면 그 순서로 Queue 를 만들 수 있다.
    Queue<String> queue = new PriorityQueue<>(new StringLengthComparator());
    queue.addAll(List.of("Zebra", "Monkey", "Cat"));
    System.out.println(queue.poll());
    System.out.println(queue.poll());
    System.out.println(queue.poll());
  }
}

class StringLengthComparator implements Comparator<String> {

  @Override
  public int compare(String string1, String string2) {
    return Integer.compare(string1.length(), string2.length());
  }
}
