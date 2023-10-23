package com.in28minutes.loops.exercise;

public class WhileNumberPlayer {

  int limit;

  public WhileNumberPlayer(int limit) {
    this.limit = limit;
  }

  public void printSquraesUptoLimit() {
    int i = 1;
    while (i * i < limit) {
      System.out.print(i * i + " ");
      i++;
    }
    System.out.println();
  }

  public void printCubesUptoLimit() {
    int i = 1;
    while (i * i * i < limit) {
      System.out.print(i * i * i + " ");
      i++;
    }
    System.out.println();
  }
  //   public List<Integer> printSquraesUptoLimit() {
  //     int i = 1;
  //     List<Integer> squares = new ArrayList<>();
  //     while (i < this.limit) {
  //       int square = i * i;
  //       if (square < this.limit) {
  //         squares.add(i * i);
  //       }
  //       i++;
  //     }
  //     return squares;
  //   }

  //   public List<Integer> printCubesUptoLimit() {
  //     int i = 1;
  //     List<Integer> cubes = new ArrayList<>();
  //     while (i < this.limit) {
  //       int cube = i * i * i;
  //       if (cube < this.limit) {
  //         cubes.add(i * i * i);
  //       }
  //       i++;
  //     }
  //     return cubes;
  //   }
}
