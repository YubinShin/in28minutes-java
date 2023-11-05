package com.in28minutes.oops;

public class Book {

  private int numOfCopies;

  // 첫 번째 생성자(Book())에서 다른 생성자(Book(int numOfCopies))를 호출하기 전에 System.out.println("Parameterless Constructor is called");와 같은 다른 문장을 먼저 실행하면 안 됩니다. 생성자 호출은 항상 생성자 내부의 첫 번째 문장으로 와야 합니다.
  Book() {
    // 방법 1
    // this.numOfCopies = 1000;
    // 방법2 이게 더 낫습니다.
    this(1000);
  }

  Book(int numOfCopies) {
    System.out.println("Constructor is called");
    this.numOfCopies = numOfCopies;
  }


  
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
