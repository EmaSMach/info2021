package ejercicios.propuestos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// import java.time.LocalDate;

public class Ejer5 {
    // private static final List<Employee> employees = new ArrayList<>();
    public static void main(String[] args) {
        EmployeeManager empMan = new EmployeeManager();
        empMan.loadEmployeesFromFile("\\java\\ejercicios\\propuestos\\empleados.txt");
        // "E:\\usuarios\\alumno\\Escritorio\\info2021\\java\\ejercicios\\propuestos\\empleados.txt"
        System.out.println(empMan.getAllEmployees());
    }

    public static List<Employee> getEmployees() {
        return null;
    }
}

