package ejercicios.level2;


import java.util.ArrayList;
import java.util.List;

import ejercicios.level1.myutils.Utils;


public class Ejer1 {
    public static void main(String[] args) {
        List<String> cities = askForCities();
        int counter = 1;
        for (Object city: cities){
            System.out.printf("#%d - %s", counter, city);
            System.out.println();
            counter ++;
        }
    }

    public static List<String> askForCities(){
        boolean go = true;
        List<String> cities = new ArrayList<String>();
        while (go==true){
            String city = Utils.askForStr("Ingrese Ciudad: ");
            if (city.isBlank()){
                go = false;
            } else {
                cities.add(city);
            }
        }
        return cities;
    }
}
