package ejercicios.level1;

import java.util.Scanner;

public class Ejer5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Primer numero: ");
        int num1 = scanner.nextInt();
        System.out.print("Segundo numero: ");
        int num2 = scanner.nextInt();
        scanner.close();
        System.out.printf("%d x %d = %d", num1, num2, mult(num1, num2));
        System.out.println();
    }

    public static int mult(int a, int b){
        int result = 0;
        for (int i=0; i<a; i++){
            result += b;
        }
        return result;
    }
}
