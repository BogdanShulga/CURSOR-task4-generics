package main.java;

import main.java.classes.BanknoteKeeper;

public class Main {
    public static void main(String[] args) {

        BanknoteKeeper banknoteKeeper = new BanknoteKeeper();

        long start = System.currentTimeMillis();
        System.out.println(banknoteKeeper.withdrawCash(2335424524242695565.6465461565465465465456));
        long end = System.currentTimeMillis();

        System.out.print("Execution time is " + (end - start) / 1000d + " seconds");
    }
}
