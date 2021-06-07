package ejercicios.level1;


import java.util.HashMap;
import java.util.Map;

import ejercicios.level1.myutils.Utils;

import java.lang.Character;


public class Ejer7 {
    public static void main(String[] args) {
        String word = Utils.askForStr("Ingrese palabra: ");
        System.out.println(toUpper(word));
    }

    public static Map<Character, Character> setLetters(){
        Map<Character, Character> letters = new HashMap<>();
        letters.put('a', 'A');
        letters.put('b', 'B');
        letters.put('c', 'C');
        letters.put('d', 'D');
        letters.put('e', 'E');
        letters.put('f', 'F');
        letters.put('g', 'G');
        letters.put('h', 'H');
        letters.put('i', 'I');
        letters.put('j', 'J');
        letters.put('k', 'K');
        letters.put('l', 'L');
        letters.put('m', 'M');
        letters.put('n', 'N');
        letters.put('ñ', 'Ñ');
        letters.put('o', 'O');
        letters.put('p', 'P');
        letters.put('q', 'Q');
        letters.put('r', 'R');
        letters.put('s', 'S');
        letters.put('t', 'T');
        letters.put('u', 'U');
        letters.put('v', 'V');
        letters.put('w', 'W');
        letters.put('x', 'X');
        letters.put('y', 'Y');
        letters.put('z', 'Z');
        letters.put(' ', ' ');
        letters.put('á', 'Á');
        letters.put('é', 'É');
        letters.put('í', 'Í');
        letters.put('ó', 'Ó');
        letters.put('ú', 'Ú');

        return letters;
    }

    public static char[] splitWord(String word){
        char[] lletters = new char[word.length()];
        for (int i = 0; i<word.length(); i++){
            lletters[i] = word.charAt(i);
        }
        return lletters;
    }

    public static String toUpper(String word){
        char[] splitted = splitWord(word);
        Map<Character, Character> letters = setLetters();
        for (int i = 0; i<splitted.length; i++) {
            char ch = splitted[i];
            if (letters.containsKey(ch)){
                splitted[i] = letters.get(ch);
            }
        }
        return new String(splitted);
    }

}
