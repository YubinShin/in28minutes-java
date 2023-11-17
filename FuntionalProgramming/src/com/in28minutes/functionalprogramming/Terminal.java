package com.in28minutes.functionalprogramming;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Terminal {

  /**
   * 종단 연산의 결과는 보통 하나의 값입니다.
   *
   * reduce
   *
   * 함수를 reduce 메서드의 파라미터로 보낼수 있기 때문에 일시적 변수같은게 필요가 없습니다
   */
  public static void main(String[] args) {
    exampleReduce();
    exampleMax();
    exampleCollect();
    exerciseCollect();
    exerciseMap();
  }

  public static void exampleReduce() {
    System.out.println(IntStream.range(1, 11).reduce(0, (a, b) -> a + b));
  }

  public static void exampleMax() {
    // 비교자 인터페이스를 구현해야한다.
    System.out.println(
      List
        .of(23, 12, 34, 53)
        .stream()
        .max((a, b) -> Integer.compare(a, b))
        .get()
    );
    /**
     * Optional 은 자바8부터 도입된 타입입니다.
     * 리스트에 아무 값도 없을때 max 는 null 입니다.
     * 하지만 null이 프로그래밍에서 나오는건 매우매우 안좋기 때문에
     * Optional 이란걸 만들어 줬어요
     * 옵셔널은 나중에 더 설명할게요
     */
  }

  /**
   * collect
   * 종단 연산 중 또 다른 객체로 만들어주는 메서드
   */
  public static void exampleCollect() {
    System.out.println(
      List
        .of(23, 12, 34, 53)
        .stream()
        .filter(i -> i % 2 == 1)
        .collect(Collectors.toList())
    );
  }

  public static void exerciseCollect() {
    System.out.println(
      List
        .of(23, 12, 34, 53)
        .stream()
        .filter(i -> i % 2 == 0)
        .collect(Collectors.toList())
    );
  }

  public static void exerciseMap() {
    System.out.println(
      IntStream
        .range(1, 11)
        .map(i -> i * i) // java.util.stream.IntPipeline 이라는 형태로 반환합니다. 얘는 stream 이 아닙니다
        .boxed() // IntStream을 Stream<Integer>로 변환
        .collect(Collectors.toList())
    );
  }
}
// class NumComparator implements Comparator<Integer> {
//   @Override
//   public int compare(Integer arg0, Integer arg1) {
//     return Integer.compare(arg0, arg1);
//   }
// }
// 함수형 인터페이스 덕에 comparator 를 굳이 구현하지 않아도 비교할수 있슴다
