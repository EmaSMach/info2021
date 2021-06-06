package ejercicios.level1;

import java.util.Scanner;

public class Ejer3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese numero: ");
        int num = scanner.nextInt();
        scanner.close();
        for (int i=1; i<=num; i++){
            for (int x=1; x<=i; x++){
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }    
}
