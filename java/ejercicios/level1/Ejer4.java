package ejercicios.level1;

import java.util.Scanner;


public class Ejer4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.printf("El factorial de %d es: %d", num, factorial(num));
        System.out.println();
        scanner.close();
    }

    public static long factorial(long num){
        if (num == 0 || num == 1){
            return 1;
        } else {
            return num * factorial(num - 1);
        }
    }
}
