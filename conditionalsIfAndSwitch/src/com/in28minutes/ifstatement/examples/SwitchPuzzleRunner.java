package com.in28minutes.ifstatement.examples;

public class SwitchPuzzleRunner {

  public static void main(String[] args) {
    puzzleOne();
  }

  public static void puzzleOne() {
    int number = 2;
    switch (number) {
      case 1:
        System.out.println(1);
      case 2:
        System.out.println(2);
      case 3:
        System.out.println(3);
      default:
        System.out.println("default");
    }
  }

  /** fall through 방식
   * switch 문에서는 조건에 부합하는 부분부터 break 가 나타나기 전까지를 실행한다.
   */
  public static void puzzleTwo() {
    int number = 2;
    switch (number) {
      case 1:
        System.out.println(1);
      case 2:
      case 3:
        System.out.println("Number is 2 or 3");
        break;
      default:
        System.out.println("default");
        break;
    }
  }

  public static void puzzleThree() {
    int number = 10;
    switch (number) {
      case 1:
        System.out.println(1);
        break;
      case 2:
        System.out.println(2);
        break;
      case 3:
        System.out.println(3);
        break;
      default:
        System.out.println("default");
        break;
    }
  }

  /** Switch 문에서는 첫번째에서 default 를 둘 수 있다.
   *  If Else 문에서는 else(default) 를 마지막만 둘 수 있다.
   */
  public static void puzzleFour() {
    int number = 10;
    switch (number) {
      default:
        System.out.println("default");
        break;
      case 1:
        System.out.println(1);
        break;
      case 2:
        System.out.println(2);
        break;
      case 3:
        System.out.println(3);
        break;
    }
  }

  /** Compiler Error
   *
   * Long, Double, Float 타입은 Switch 조건이 불가능
   *
   * Switch 조건문에서 사용가능한 자료형
   *
   * byte, char, int, short
   * String, enum
   */

  public static void puzzleFive() {
    // long l = 15;
    // switch(l) {
    // }
  }

  /**
   * 조건식은 switch 문의 case 문으로 사용 불가능
   *
   * switch 문의 case 문은 상수 또는 상수로 평가되는 표현식만 허용됩니다.
   */
  public static void puzzleSix() {
    // int number = 10;
    // int i = number * 2;
    // switch (number) {
    //   case number > 5:
    //     System.out.println("number>5");
    // }
  }
}
