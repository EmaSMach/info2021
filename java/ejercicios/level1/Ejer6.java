package ejercicios.level1;

import ejercicios.level1.myutils.Utils;


public class Ejer6 {
    public static void main(String[] args) {
        int num1 = Utils.askForInt("Number 1: ");
        int num2 = Utils.askForInt("Number 2: ");
        Utils.closeScanner();
        System.out.printf("%d elevado a %d = %d", num1, num2, pow(num1, num2));
        System.out.println();
    }

    public static long pow(int a, int b){
        long res = 1;
        for (int i = 0; i<b; i++){
            res *= a;
        }
        return res;
    }
}
