package main.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        BanknoteKeeper banknoteKeeper = new BanknoteKeeper();

        double n = 0;
        boolean stop = false;

        Scanner scanner = new Scanner(System.in);
        while (!stop) {
            System.out.println("Please enter the amount of your money:");
            try {
                n = scanner.nextDouble();
            } catch (Exception ex) {
                System.out.println("You entered incorrect data!");
                scanner.nextLine();
                continue;
            }
            stop = true;
        }

        System.out.print("Your number of bills: ");
        System.out.println(banknoteKeeper.withdrawCash(n));

        long start = System.currentTimeMillis();
        for (int i = 24565; i < 35790; i++) {
            banknoteKeeper.withdrawCash(i);
        }
        long end = System.currentTimeMillis();
        System.out.print("Time to calculate the number of bills for amounts from 24565 grn to 35789 grn is:  " + (end - start) / 1000d + " seconds");
    }
}
