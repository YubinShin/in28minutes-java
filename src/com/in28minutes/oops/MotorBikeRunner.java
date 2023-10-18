package com.in28minutes.oops;

public class MotorBikeRunner {

  public static void main(String[] args) {
    MotorBike ducati = new MotorBike();
    MotorBike honda = new MotorBike();
    // ducati.start();
    // honda.start();
    // 클래스의 메서드는 모든 객체에 의해서 작동될 수 있습니다.

    // MotorBike.speed; // 에러 발생, speed 는 인스턴스 변수이기 때문에 인스턴스로부터 참조될 수 있다.

    ducati.speed = 100;
    // honda.speed = 80;
    // 교통 체증 때문에 속도 상태가 변했다.
    // ducati.speed = 20;
    // honda.speed = 0;

    ducati.setSpeed(10);
  }
}
