package ejercicios.level1;

import java.util.Scanner;


public class Ejer1 {
    public static void main(String[] args) {
        sayHi(pedirNombre());
    }

    public static String pedirNombre() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Usuario: ");
        String name = scanner.nextLine();
        scanner.close();
        return name;
    }

    public static void sayHi(String name) {
        System.out.println("HOLA " + name.toUpperCase());
    } 
}
