package com.in28minutes.oops.level2;

public class CustomerRunner {

  // Object Composition 객체 구성관계 - 객체 안에 클래스나 객체가 있는 것
  public static void main(String[] args) {
    Address homeAddress = new Address("서울", "중구", "04575");
    Customer customer = new Customer("유빈", homeAddress);
    Address workAddress = new Address("서울", "성동구", "04575");
    customer.setWorkAddress(workAddress);
    System.out.println(customer);
  }
}
