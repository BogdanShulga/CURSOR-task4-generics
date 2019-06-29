package main.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        BanknoteKeeper banknoteKeeper = new BanknoteKeeper();

        double n = 0;
        boolean stop = false;

        Scanner scanner = new Scanner(System.in);
        while (!stop){
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

        System.out.println("Your number of bills: ");
        if (n > 24564 && n < 35790) {
            long start = System.currentTimeMillis();
            System.out.println(banknoteKeeper.withdrawCash(n));
            long end = System.currentTimeMillis();
            System.out.print("Execution time is " + (end - start) / 1000d + " seconds");
        } else {
            System.out.println(banknoteKeeper.withdrawCash(n));
        }
    }
}
