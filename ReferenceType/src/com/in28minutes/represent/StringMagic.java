package com.in28minutes.represent;

public class StringMagic {

  public int countUppercaseLetters(String str) {
    int result = 0;
    for (int i = 0; i < str.length(); i++) {
      char mychar = str.charAt(i);
      if (Character.isUpperCase(mychar)) {
        result++;
      }
    }
    return result;
  }

  public boolean hasConsecutiveDuplicates(String str) {
    int i = 0;
    int j = 1;
    while (j < str.length()) {
      if (str.charAt(i) == str.charAt(j)) {
        return true;
      }
      i++;
      j++;
    }
    return false;
  }

  public int getRightmostDigit(String str) {
    if (str.isEmpty()) {
      return -1;
    }
    int i = str.length() - 1;
    while (i >= 0) {
      if (Character.isDigit(str.charAt(i))) {
        return Character.getNumericValue(str.charAt(i));
      }
      i--;
    }
    return -1;
  }

  public String findLongestWord(String sentence) {
    String[] array = sentence.split(" ");
    String result = "";
    for (String item : array) {
      if (item.length() > result.length()) {
        result = item;
      }
    }
    return result;
  }
  /** 
   * 
    예, String은 불변(immutable) 자료형입니다. 이것은 새로운 문자열을 만들 때 기존 문자열을 변경하지 않고 새로운 문자열을 반환한다는 것을 의미합니다. 따라서 result = item와 같이 문자열을 다른 문자열로 바꾸는 것은 문제가 없습니다.
    result = item의 경우, item 문자열의 길이가 result 문자열의 길이보다 길 때마다 result 변수에 item 문자열을 새로 할당합니다. 이것은 새로운 문자열을 만들어 result 변수가 새로운 문자열을 참조하도록 합니다. String 불변성의 장점 중 하나는 이러한 작업이 비용이 비싸지 않고 효율적으로 처리된다는 것입니다.
    따라서 result = item를 사용하여 result 변수를 가장 긴 단어인 item 문자열로 업데이트하는 것은 안전하고 효율적인 방법입니다.
   */
}
