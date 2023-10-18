package com.in28minutes.oops;

public class MotorBike {

  // state
  private int speed; // member variable 는 객체에 종속됩니다. this.speed 라고 부르게됨

  // behaviour
  void start() {
    System.out.println("부릉부릉");
  }

  public int getSpeed() {
    return speed;
  }

  public void setSpeed(int speed) {
    // 매개변수에 있는 speed 는 지역변수
    // 멤버변수는 this.speed
    this.speed = speed;
  }
}
