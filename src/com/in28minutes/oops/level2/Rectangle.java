package com.in28minutes.oops.level2;

public class Rectangle {

  // state
  int length;
  int width;

  // creation
  Rectangle(int length, int width) {
    this.length = length;
    this.width = width;
  }

  // operations
  public int getArea() {
    return length * width;
  }

  public int getPerimeter() {
    return (length + width) * 2;
  }

  public String toString() {
    return String.format(
      "Length : %d, Width : %d, Area : %d, Perimeter %d",
      length,
      width,
      getArea(),
      getPerimeter()
    );
  }

  public int getLength() {
    return length;
  }

  public int getWidth() {
    return width;
  }

  public void setLength(int length) {
    this.length = length;
  }

  public void setWidth(int width) {
    this.width = width;
  }
}
