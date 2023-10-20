package com.in28minutes;

public class BiNumber {

  int number1;
  int number2;

  BiNumber() {
    this(1, 2);
  }

  BiNumber(int number1, int number2) {
    this.number1 = number1;
    this.number2 = number2;
  }

  public int add() {
    return this.number1 + this.number2;
  }

  public int multiply() {
    return this.number1 * this.number2;
  }

  public int getNumber1() {
    return number1;
  }

  public int getNumber2() {
    return number2;
  }

  public void doubleNumbers() {
    this.number1 *= 2;
    this.number2 *= 2;
  }
}
