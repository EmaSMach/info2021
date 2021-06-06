package ejercicios.level1.myutils;

import java.util.Scanner;

public class Utils {

    public static final Scanner scanner = new Scanner(System.in);

    public static int addTwonums(int a, int b){
        return a + b;
    }

    public static int mult(int a, int b){
        int result = 0;
        for (int i=0; i<a; i++){
            result += b;
        }
        return result;
    }

    public static int askForInt(String message){
        System.out.print(message);
        int num = scanner.nextInt();
        return num;
    }

    public static void closeScanner(){
        scanner.close();
    }

}
