package com.in28minutes.oops.level2;

public class Customer {

  // customer 인스턴스는 주소 클래스의 인스턴스에 대해 참조관계를 갖습니다.
  // 이걸 객체 구성관계라고 합니다.

  // State
  private String name;
  private Address homeAddress;
  private Address workAddress;

  // Creation
  public Customer(String name, Address homeAddress) {
    this.name = name;
    this.homeAddress = homeAddress;
  }

  // Operations

  public String getName() {
    return name;
  }

  public Address getHomeAddress() {
    return homeAddress;
  }

  public Address getWorkAddress() {
    return workAddress;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setHomeAddress(Address homeAddress) {
    this.homeAddress = homeAddress;
  }

  public void setWorkAddress(Address workAddress) {
    this.workAddress = workAddress;
  }

  public String toString() {
    return String.format(
      "이름 %s, 집주소: %s, 직장주소: %s",
      name,
      homeAddress,
      workAddress
    );
  }
}
