package com.in28minutes.oops;

public class MotorBike {

  // state
  private int speed;

  // member variable 는 객체에 종속됩니다. this.speed 라고 부르게됨
  // int 멤버 변수의 디폴트 시작값은 0 입니다.

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

    // 캡슐화 LEVE1 : Setter 를 쓰면 원하지 않는 방식으로 변수가 조작되는 것을 방지 할 수 있습니다.
    if (speed > 0) this.speed = speed;
  }

  public void increaseSpeed(int howMuch) {
    this.speed = this.speed + howMuch;
  }

  public void decreaseSpeed(int howMuch) {
    this.speed = this.speed - howMuch;
  }
}
