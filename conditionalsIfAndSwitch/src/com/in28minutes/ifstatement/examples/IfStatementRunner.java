package com.in28minutes.ifstatement.examples;

public class IfStatementRunner {

  public static void main(String[] args) {
    puzzleOne();
  }

  public static void puzzleOne() {
    int k = 15;
    if (k > 20) {
      System.out.println(1);
    } else if (k > 10) {
      System.out.println(2);
    } else if (k < 20) {
      System.out.println(3);
    } else {
      System.out.println(4);
    }
  }

  public static void puzzleTwo() {
    // 이렇게 쓰지 마세영. 다음 사람이 볼 때 짱나요.
    int l = 15;
    if (l < 20) System.out.println("l < 20");
    if (l > 20) System.out.println("l > 20"); // 사실 첫번째 if 문과 두번째 IF문은 독립적인 문 입니다.
    else System.out.println("Who Am I?");
  }

  public static void puzzleThree() {
    /**
     *  이렇게 쓰지 마세영. 다음 사람이 볼 때 짱나요.
    int m = 15;
    if (m > 20) 
        if (m < 20) 
    System.out.println("m >  20"); 
        else 
    System.out.println("Who Am I?");
     */
    int m = 15;
    if (m > 20) {
      if (m < 20) {
        System.out.println("m >  20");
      } else {
        System.out.println("Who Am I?");
      }
    }
  }

  public static void puzzleFive() {
    // 이렇게 쓰지 마세영. 다음 사람이 볼 때 짱나요.
    /** 
    int number = 5;
    if(number < 0)
    number = number + 10;
    number++;
    System.out.println(number); 
    ;
    */
    int number = 5;
    if (number < 0) number = number + 10;
    number++;
    System.out.println(number);
  }
}
