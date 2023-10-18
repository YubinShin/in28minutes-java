package com.in28minutes.oops;

public class MotorBikeRunner {

  public static void main(String[] args) {
    MotorBike ducati = new MotorBike();
    MotorBike honda = new MotorBike();
    ducati.start();
    honda.start();
    // 클래스의 메서드는 모든 객체에 의해서 작동될 수 있습니다.
  }
}
