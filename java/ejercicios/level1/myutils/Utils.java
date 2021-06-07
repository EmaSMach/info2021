package ejercicios.level1.myutils;

import java.nio.charset.Charset;
import java.util.Scanner;

public class Utils {

    public static Scanner scanner = new Scanner(System.in, Charset.forName("UTF-8"));
    // public static Locale loc = new Locale("es", "ES");
    // public static final BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
    // public static final Input
    

    public static int addTwonums(int a, int b){
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
        
        // if (scanner.hasNextLine()){
        //     string = scanner.nextLine();
        //     return string;
        // } else {
        //     string = scanner.next();
        //     return string;
        // }
        
    }

    // public static String askForStr2(String message){
    //     System.out.print(message);
    //     String string = bReader.
        // try {
        //     String string = bReader.readLine();
        //     return string;
        // } catch (IOException e) {
        //     System.out.println("Nada");
        //     return "";
        // }
        


    public static void closeScanner(){
        scanner.close();
    }

}
