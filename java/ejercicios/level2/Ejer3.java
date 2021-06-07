package ejercicios.level2;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Ejer3 {
    public static void main(String[] args) {
        List<Integer> cards = loadCards();
        System.out.println(cards);
        Collections.reverse(cards);
        System.out.println(cards);
        Collections.shuffle(cards);
        System.out.println(cards);
    }

    public static List<Integer> loadCards(){
        List<Integer> cards = new ArrayList<>();
        for (int i=1; i<=13; i++){
            cards.add(i);
        }
        return cards;
    }
}
