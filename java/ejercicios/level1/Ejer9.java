package ejercicios.level1;

import ejercicios.level1.myutils.Utils;

public class Ejer9 {
    public static void main(String[] args) {
        String phrase = Utils.askForStr("Palabra: ");
        String substring = Utils.askForStr("Letra: ");
        int ocurrences = count(substring, phrase);
        System.out.println(ocurrences);   
    }

    public static int count(String substring, String string){
        int ocurrences = 0;
        boolean go = true;
        while (go==true){
            int res = string.indexOf(substring);
            if (res >= 0){
                ocurrences++;
                string = string.substring(res + 1, string.length());
            } else {
                go = false;
            }
        }
        return ocurrences;
    }
}
