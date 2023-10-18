package com.in28minutes.oops;

public class MotorBike {

  // state
  int speed; // member variable 는 객체에 종속됩니다. this.speed 라고 부르게됨

  // behaviour
  void start() {
    System.out.println("부릉부릉");
  }

  void setSpeed(int speed) {
    this.speed = speed;
  }
}
