package ejercicios.propuestos;

import java.nio.charset.Charset;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class Utils {

    public static Scanner scanner = new Scanner(System.in, Charset.forName("UTF-8"));
    
    public static int addTwoNums(int a, int b){
        return a + b;
    }

    public static int mult(int a, int b){
        int result = 0;
        for (int i=0; i<a; i++){
            result += b;
        }
        return result;
    }

    public static int askForInt(String message){
        System.out.print(message);
        int num = scanner.nextInt();
        scanner.nextLine(); //check
        return num;
    }

    public static String askForStr(String message){
        System.out.print(message);
        String string;
        string = scanner.nextLine();
        return string;
    }

    public static void closeScanner(){
        scanner.close();
    }

    public static LocalDate stringToLocalDate(String dateString) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate localDate = LocalDate.parse(dateString, dtf);
        return localDate;
    }
}
