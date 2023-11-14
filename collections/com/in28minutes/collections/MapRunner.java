package com.in28minutes.collections;

import java.util.TreeMap;

public class MapRunner {

  static String str =
    "This is an awesome Occasion. This has never happend before.";

  public static void main(String[] args) {
    practice(str);
  }

  public static void practice(String input) {
    char[] charArray = input.toCharArray();
    String[] wordsArray = input.split(" ");
    TreeMap<Character, Integer> charMap = new TreeMap<>();
    TreeMap<String, Integer> wordsMap = new TreeMap<>();

    for (Character cha : charArray) {
      charMap.put(cha, charMap.getOrDefault(cha, 0) + 1);
    }

    for (String word : wordsArray) {
      wordsMap.put(word, wordsMap.getOrDefault(word, 0) + 1);
    }

    System.out.println("charMap :" + charMap);
    System.out.println("wordsMap : " + wordsMap);
  }
}
