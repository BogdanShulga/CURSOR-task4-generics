package main.java.classes;

import java.util.*;

public class BanknoteKeeper {

    public <T extends Number> String withdrawCash(T cash) {

        List<Integer> banknotes = new ArrayList<>(Arrays.asList(500, 200, 100, 50, 20, 10, 5, 2, 1));

        Iterator banknotesIterator = banknotes.iterator();

        int count;
        int remainder = cash.intValue();
        int banknote;

        StringBuilder b = new StringBuilder();
        b.append(cash);
        b.append(" = ");

        while (banknotesIterator.hasNext()) {
            banknote = (int) banknotesIterator.next();
            if (remainder >= banknote) {
                count = remainder / banknote;
                remainder = remainder % banknote;
                b.append(count);
                b.append("*");
                b.append(banknote);
                if (banknotesIterator.hasNext() && remainder >= 1) {
                    b.append(";");
                }
            }
        }
        return b.toString();

    }
}
