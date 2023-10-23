package com.in28minutes.loops.exercise;

import java.util.Scanner;

public class DoWhileRepeatedQuestionRunner {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int number = -1;
    do {
      if (number != -1) {
        System.out.println("Cube is " + number * number * number);
      }
      System.out.println("Enter a number : ");
      number = scanner.nextInt();
    } while (number >= 0);

    System.out.println("Thank You! Have Fun!");
    /**
     * 코드 줄을 선택하고 alt + 상하 키 하면 줄이 오르락 내리락 합니다.
     *
     * 스캐너는 반복해서 만들지 않아도 돼요.
     * 맨 위에 넣고 사용자가 유효한 숫자를 넣으면 코드를 반복할거에요
     */
  }
}
