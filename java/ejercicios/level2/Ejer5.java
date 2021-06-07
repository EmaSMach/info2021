package ejercicios.level2;

import java.util.ArrayList;
import java.util.List;

public class Ejer5 {
    public static void main(String[] args) {
        calculate();
    }

    public static void calculate(){
        List<Integer> hours = new ArrayList<>();
        List<Integer> paymentPerHour = new ArrayList<>();
        hours.add(6);
        hours.add(7);
        hours.add(8);
        hours.add(4);
        hours.add(5);

        paymentPerHour.add(350);
        paymentPerHour.add(345);
        paymentPerHour.add(550);
        paymentPerHour.add(600);
        paymentPerHour.add(320);

        List<Integer> totals = new ArrayList<>();
        for (int i = 0; i < hours.size(); i++) {
            totals.add(hours.get(i) * paymentPerHour.get(i));
        }
        System.out.println(totals);
        int total = 0;
        for (Integer res: totals) {
            total += res;
        }
        System.out.printf("Total Final: $ %d", total);
        System.out.println();
    }
}
