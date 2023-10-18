package com.in28minutes.oops;

public class Book {

  private int numOfCopies;

  void read() {
    System.out.println("This book is cool");
  }

  public void setNumOfCopies(int numOfCopies) {
    this.numOfCopies = numOfCopies;
  }

  public int getNumOfCopies() {
    return numOfCopies;
  }

  public void increaseNumOfCopies(int howMuch) {
    this.numOfCopies = this.numOfCopies + howMuch;
  }

  public void decreaseNumOfCopies(int howMuch) {
    this.numOfCopies = this.numOfCopies - howMuch;
  }
}
