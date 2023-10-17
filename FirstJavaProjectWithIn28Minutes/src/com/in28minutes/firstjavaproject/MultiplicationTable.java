package com.in28minutes.firstjavaproject;

public class MultiplicationTable {
    // public static void main(String[] args) {
    // this.print();
    // }
    void print() {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d * %d = %d", 5, i, 5 * i).println();
        }
    }

    void print(int table) {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d * %d = %d", table, i, table * i).println();
        }
    }

    void print(int table, int from, int to) {
        for (int i = from; i <= to; i++) {
            System.out.printf("%d * %d = %d", table, i, table * i).println();
        }
    }
}
