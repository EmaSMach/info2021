package ejercicios.level2;

import java.util.List;
import java.util.ArrayList;

public class Ejer2 {
    public static void main(String[] args) {

        List<Integer> array = new ArrayList<Integer>();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);
        int sizeBefore = array.size();
        array.add(0, 999);
        array.add(array.size(), 555);
        System.out.printf("Tamano antes de insertar: %d", sizeBefore);
        System.out.println();
        System.out.printf("Tamano luego de insertar: %d", array.size());
        System.out.println();
        // System.out.println(array);
    }


}
