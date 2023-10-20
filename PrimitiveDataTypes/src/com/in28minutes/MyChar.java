package com.in28minutes;

public class MyChar {

  private char mine;

  public MyChar(char param) {
    this.mine = param;
  }

  public boolean isAlphabet() {
    // (int) 'a' 는 97  (int) 'z' 는 122

    return (
      (this.mine >= 'a' && this.mine <= 'z') ||
      (this.mine >= 'A' && this.mine <= 'Z')
    );
  }

  public boolean isVowel() {
    char lowerCaseChar = Character.toLowerCase(this.mine);
    return (
      lowerCaseChar == 'a' ||
      lowerCaseChar == 'e' ||
      lowerCaseChar == 'i' ||
      lowerCaseChar == 'o' ||
      lowerCaseChar == 'u'
    );
  }

  //  "Consonant"는 영어에서 자음을 나타내는 단어입니다.
  public boolean isConsonant() {
    // 내 답
    // char lowerCaseChar = Character.toLowerCase(this.mine);
    // return !(
    //   lowerCaseChar == 'a' ||
    //   lowerCaseChar == 'e' ||
    //   lowerCaseChar == 'i' ||
    //   lowerCaseChar == 'o' ||
    //   lowerCaseChar == 'u'
    // );

    // 강의 답
    return !isVowel();
  }

  // "Digit"는 영어에서 숫자를 나타내는 단어입니다.
  public boolean isDigit() {
    // 내 답
    // return this.mine >= '0' && this.mine <= '9';

    // 강의 답
    if (mine >= 48 && mine <= 57) { // between '0' and '9'
      return true;
    }
    return false;
  }

  public static void printLowerCaseAlphabets() {
    for (char c = 'a'; c <= 'z'; c++) {
      System.out.print(c + " ");
    }
    System.out.println();
  }

  public static void printUpperCaseAlphabets() {
    for (char c = 'A'; c <= 'Z'; c++) {
      System.out.print(c + " ");
    }
    System.out.println();
  }
}
