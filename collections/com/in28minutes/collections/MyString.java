package com.in28minutes.collections;

public class MyString {

  public String str;

  public MyString(String str) {
    this.str = str;
  }

  public static boolean isHexadecimalChar(char ch) {
    // Write your code here
    if (Character.isDigit(ch)) {
      return true;
      //   if (ch >= 0 && ch <= 9) {
      //   } 불필요하다
    } else {
      ch = Character.toUpperCase(ch);
      return (ch >= 'A' && ch <= 'F');
    }
  }

  public boolean isHexadecimal() {
    // Write your code here
    if (str == null || str.length() == 0) {
      return false;
    }
    for (char cha : str.toCharArray()) {
      if (!isHexadecimalChar(cha)) {
        return false;
      }
    }
    return true;
  }
}
