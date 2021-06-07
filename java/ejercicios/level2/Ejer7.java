package ejercicios.level2;

import java.util.ArrayList;
import java.util.List;

import ejercicios.level1.myutils.Utils;

public class Ejer7 {
    public static void main(String[] args) {
        int start = Utils.askForInt("Inicio: ");
        int end = Utils.askForInt("Final: ");
        List<String> array = fizzBuzz(start, end);
        System.out.println(array);
    }

    public static List<String> fizzBuzz(int start, int end){
        List<String> fizzer = new ArrayList<>();
        for (int i = start; i < end; i++) {
            if ((i % 2 == 0) && (i % 3 == 0)){
                fizzer.add("FizzBuzz");
                continue;
            } else if (i % 2 == 0){
                fizzer.add("Fizz");
                continue;
            } else if (i % 3 == 0){
                fizzer.add("Buzz");
                continue;
            } else {
                fizzer.add(String.valueOf(i));
                continue;
            }
        }
        return fizzer;
    }
}
