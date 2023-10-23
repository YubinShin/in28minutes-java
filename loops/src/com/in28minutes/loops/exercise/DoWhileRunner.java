package com.in28minutes.loops.exercise;

import java.util.Scanner;

public class DoWhileRunner {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number : ");
    int inputNum = scanner.nextInt();
    System.out.println("Cube is " + inputNum * inputNum * inputNum);
    System.out.println("Thank You! Have Fun!");
    // do {}while(inputNum <= 0)
  }
}
