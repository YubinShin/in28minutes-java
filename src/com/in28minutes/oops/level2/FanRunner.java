package com.in28minutes.oops.level2;

public class FanRunner {

  public static void main(String[] args) {
    Fan fan = new Fan("삼성", 0.34567, "Green");
    System.out.println(fan);
    fan.switchOn();
    System.out.println(fan);
    fan.setSpeed((byte) 30);
    System.out.println(fan);
    fan.switchOff();
    System.out.println(fan);
  }
}
