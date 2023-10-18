package com.in28minutes.oops;

public class BookRunner {

  public static void main(String[] args) {
    Book artOfComputerProgramming = new Book();
    Book effectiveJava = new Book();
    Book cleanCode = new Book();

    cleanCode.read();
    cleanCode.setNumOfCopies(1); // 이렇게 하면 Encapsulation 이 파괴됩니다.
  }
}
