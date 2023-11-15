package com.in28minutes.collections;

import java.util.Arrays;

public class StringMagic {

  public static void main(String[] args) {
    System.out.println(areAnagrams("Listen", "Silent"));
  }

  public static boolean areAnagrams(String str1, String str2) {
    // Write your code here
    if (str1 == null || str2 == null) {
      return false;
    }
    char[] str1Arr = str1.toLowerCase().toCharArray();
    char[] str2Arr = str2.toLowerCase().toCharArray();
    Arrays.sort(str1Arr); // 불변 자료형인데 정렬은 괜찮은걸까?
    Arrays.sort(str2Arr);
    if (str1Arr.length == str2Arr.length) {
      return Arrays.equals(str1Arr, str2Arr);
    }
    return false;
  }

  public String reverseWordsInSentence(String sentence) {
    if (sentence == null) {
      return "INVALID";
    }
    String[] wordArray = sentence.trim().split("\\s+");
    StringBuilder result = new StringBuilder();
    for (String word : wordArray) {
      StringBuilder wordBuilder = new StringBuilder(word);
      result.append(wordBuilder.reverse()).append(" ");
    }
    return result.toString().trim();
  }
}
