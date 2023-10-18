package com.in28minutes.oops;

public class Book {

  private int numOfCopies;

  void read() {
    System.out.println("This book is cool");
  }

  public void setNumOfCopies(int numOfCopies) {
    if (numOfCopies > 0) this.numOfCopies = numOfCopies;
  }

  public int getNumOfCopies() {
    return numOfCopies;
  }

  public void increaseNumOfCopies(int howMuch) {
    setNumOfCopies(this.numOfCopies + howMuch);
  }

  public void decreaseNumOfCopies(int howMuch) {
    setNumOfCopies(this.numOfCopies - howMuch);
  }
}
