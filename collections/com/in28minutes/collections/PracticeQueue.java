package com.in28minutes.collections;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class PracticeQueue {

  /** Queue 는 컬렉션의 연장이라 컬렉션의 메서드를 모두 지원합니다 */
  public static void main(String[] args) {
    Queue<String> queue = new PriorityQueue<>();
    // 큐에서 요소를 꺼낼땐 poll
    queue.poll();
    // 큐에 요소를 넣을땐 offer
    queue.offer("Apple");
    // 큐에 여러 개의 요소를 넣을땐 addAll
    // 먼저 리스트를 만들고, 그 안에 넣습니다.
    queue.addAll(List.of("Zebra", "Monkey", "Cat"));

    // Queue 는 기본적으론 오름차순으로 정렬됩니다.
    // 하지만 순서를 지정할수도 있습니다.
    queue.poll();
    System.out.println(queue);
    queue.poll();
    System.out.println(queue);
    queue.poll();
    System.out.println(queue);
    queue.poll();
    System.out.println(queue);
  }
}
