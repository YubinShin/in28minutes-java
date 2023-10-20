package com.in28minutes.loops.exercise;

public class MyNumber {

  int number;

  public MyNumber(int number) {
    this.number = number;
  }

  public boolean isPrime() {
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
  }
}
