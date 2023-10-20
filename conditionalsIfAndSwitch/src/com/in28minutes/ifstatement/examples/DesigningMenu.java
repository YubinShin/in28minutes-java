package com.in28minutes.ifstatement.examples;

import java.util.Scanner;

// 스캐너는 자바에 내재된 클래스이기에 IMPORT 해야합니다.
public class DesigningMenu {

  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in); // Systme.in 은 유저인풋, Sysyem.out 은 유저 아웃풋

    System.out.println("number1 을 입력하세요");
    int number1 = myScanner.nextInt();

    System.out.println("number2 을 입력하세요");
    int number2 = myScanner.nextInt();

    System.out.println("1. ADD");
    System.out.println("2. MUTIPLY");
    System.out.println("3. DIVIDE");
    System.out.println("4. SUBTRACT");
    System.out.print("옵션을 선택하세요 : ");
    int userInput = myScanner.nextInt();

    switch (userInput) {
      case 1:
        System.out
          .printf("%d + %d = %d", number1, number2, number1 + number2)
          .println();
        break;
      case 2:
        System.out
          .printf("%d * %d = %d", number1, number2, number1 * number2)
          .println();
        break;
      case 3:
        System.out
          .printf("%d / %d = %d", number1, number2, number1 / number2)
          .println();
        break;
      case 4:
        System.out
          .printf("%d - %d = %d", number1, number2, number1 - number2)
          .println();
        break;
      default:
        System.out.println("올바른 옵션을 선택하세요");
        break;
    }

    myScanner.close();
  }
}
