package com.in28minutes.oops.level2;

public class Fan {

  // 무작정 Getter, setter 만 생각하지 말고 사용자 입장에서 편리한 API 를 만드는게 중요합니다~
  // State
  private String make;
  private double radius;
  private String color;

  private boolean isOn;
  private byte speed; // 0 to 5 , 보통은 enums 많이 쓰지만 이번엔 이렇게 해볼게영

  // Creation
  public Fan(String make, Double radius, String color) {
    this.make = make;
    this.radius = radius;
    this.color = color;
  }

  // Behavior
  void switchOn() {
    this.isOn = true;
    setSpeed((byte) 5);
  }

  void switchOff() {
    this.isOn = false;
    setSpeed((byte) 0);
  }

  void setSpeed(byte speed) {
    this.speed = speed;
  }

  // 보통 toString 을 맨아래에 둡니다
  public String toString() {
    return String.format(
      "[make - %s, radius - %f, color - %s, isOn - %b, speed - %d]",
      make,
      radius,
      color,
      isOn,
      speed
    );
  }
}
