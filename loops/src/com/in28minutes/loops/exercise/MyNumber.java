package com.in28minutes.loops.exercise;

public class MyNumber {

  private int number;

  public MyNumber(int number) {
    this.number = number;
  }

  public boolean isPrime() {
    // 이런 조건을 Guard Check, Guard Condition 이라고 부릅니다.
    // 메소드 전에 input 값이 올바른지 체크하는 역할 입니다.
    if (this.number <= 1) {
      return false;
    }
    for (int i = 2; i <= Math.sqrt(this.number); i++) {
      if (this.number % i == 0) {
        return false;
      }
    }
    return true;
  }

  public int sumOfDivisors() {
    int result = 0;
    for (int i = 1; i <= this.number; i++) {
      if (this.number % i == 0) {
        result += i;
      }
    }
    return result;
  }

  public int sumUptoN() {
    int result = 0;
    for (int i = 1; i <= this.number; i++) {
      result += i;
    }
    return result;
  }

  public void printANumberTriangle() {
    String str = "";
    for (int i = 1; i <= this.number; i++) {
      str += i + " ";
      System.out.println(str);
    }
    // 선생님 답
    // for (int i = 1; i <= this.number; i++) {
    //   for (int j = 1; j <= i; j++) {
    //     System.out.print(j + " ");
    //   }
    //   System.out.println();
    // }
  }
}
