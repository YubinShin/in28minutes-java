package com.in28minutes.oops.level2.inheritance;

public class Person extends Object {

  private String name;
  private String email;
  private String phoneNumber;

  //   public Person() {
  // this("YUBIN")
  //   }

  // public Person() {
  //   System.out.println("Default Person Constructor");
  // }

  public Person(String name) {
    System.out.println("Person Constructor");
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  // Overriding
  public String toString() {
    return "\n❤️ : " + name + "\n❤️ : " + email + "\n❤️ : " + phoneNumber;
  }
}
