package ejercicios.level2;

import java.util.ArrayList;
import java.util.List;

public class Ejer4 {
    public static void main(String[] args) {
        List<String> students = loadNames();
        List<List<String>> courses = studentInCourses(students);
        for (List<String> course : courses) {
            System.out.printf("Curso: %s", course);
            System.out.println();
        }
    }

    public static List<String> loadNames(){
        List<String> names = new ArrayList<>();
        names.add("Emanuel");
        names.add("Clarisa");
        names.add("Isaac");
        names.add("Lucas");
        names.add("Mario");
        names.add("Andrea");
        names.add("Daniel");
        names.add("Soraya");
        names.add("Dario");
        names.add("Calixto");
        names.add("Pedro");
        names.add("Sonia");
        
        return names;
    }
    // List<String> course1, List<String> course2, List<String> course3
    public static List<List<String>> studentInCourses(List<String> students){
        List<String> course1 = students.subList(0, 4);
        List<String> course2 = students.subList(4, 8);
        List<String> course3 = students.subList(8, 12);
        List<List<String>> courses = new ArrayList<>();
        courses.add(course1);
        courses.add(course2);
        courses.add(course3);
        return courses;
    }
}
