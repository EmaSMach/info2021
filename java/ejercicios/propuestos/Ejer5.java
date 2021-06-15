package ejercicios.propuestos;

import java.util.List;

// import java.time.LocalDate;

public class Ejer5 {
    // private static final List<Employee> employees = new ArrayList<>();
    public static void main(String[] args) {
        EmployeeManager empMan = new EmployeeManager();
        empMan.loadEmployeesFromFile("\\java\\ejercicios\\propuestos\\empleados.txt");
        // "E:\\usuarios\\alumno\\Escritorio\\info2021\\java\\ejercicios\\propuestos\\empleados.txt"
        List<Employee> todo = empMan.getEmployees();
        System.out.println(todo);
        System.out.println(empMan.getLowestPaidEmployee());
        System.out.println(empMan.getHighestPaidEmployee());
        System.out.println(empMan.getEmployeesWithLastNameStartingWith("s"));
    }
}

