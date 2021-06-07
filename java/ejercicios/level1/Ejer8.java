package ejercicios.level1;

import java.util.Arrays;
import ejercicios.level1.myutils.Utils;

public class Ejer8 {
    
    public static void main(String[] args) {
        Person person = askForData();
        System.out.println(person);
    }

    public static Person askForData(){
        String fullName = Utils.askForStr("Nombre y Apellido: ");
        int age = Utils.askForInt("Edad: ");
        String address = Utils.askForStr("Direccion: ");
        String city = Utils.askForStr("Ciudad: ");
        String[] tempFullName = fullName.split(" ");
        String[] names = Arrays.copyOfRange(tempFullName, 0, tempFullName.length - 1);
        String lastName = tempFullName[tempFullName.length - 1];
        Person person = new Person(String.join(" ", names), lastName, age, address, city);
        return person;
    }
}


class Person {
    String firstName;
    String lastName;
    int age;
    String address;
    String city;

    Person(String firstName, String lastName, int age, String address, String city){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
        this.city = city;
    }

    @Override
    public String toString() {
        // {Ciudad} - {Dirección} - {Edad} - {Nombre y Apellido}
        return String.format("%s - %s - %d - %s %s", this.city, this.address, this.age, this.firstName, this.lastName);
    }
}