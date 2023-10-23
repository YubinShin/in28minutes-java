package com.in28minutes.loops.exercise;

public class WhileNumberPlayerRunner {

  public static void main(String[] args) {
    WhileNumberPlayer player = new WhileNumberPlayer(30);
    System.out.println(player.printSquraesUptoLimit());
    System.out.println(player.printCubesUptoLimit());
  }
}
