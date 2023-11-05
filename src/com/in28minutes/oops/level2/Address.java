package com.in28minutes.oops.level2;

public class Address {

  private String line1;
  private String city;
  private String zip;

  public Address(String line1, String city, String zip) {
    super();
    this.line1 = line1;
    this.city = city;
    this.zip = zip;
  }

  public String toString() {
    // TODO Auto-generated method stub
    return String.format("%s %s %s", city, line1, zip);
  }
}
