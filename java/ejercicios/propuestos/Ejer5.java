package ejercicios.propuestos;

import java.util.List;

// import java.time.LocalDate;

public class Ejer5 {
    // private static final List<Employee> employees = new ArrayList<>();
    public static void main(String[] args) {
        EmployeeManager empMan = new EmployeeManager();
        empMan.loadEmployeesFromFile("\\java\\ejercicios\\propuestos\\empleados.txt");
        // "E:\\usuarios\\alumno\\Escritorio\\info2021\\java\\ejercicios\\propuestos\\empleados.txt"
        List<Employee> allEmployees = empMan.getEmployees();
        System.out.println(allEmployees);
        System.out.println(allEmployees.get(0).getAge());
        System.out.println(empMan.getLowestPaidEmployee());
        System.out.println(empMan.getHighestPaidEmployee());
        System.out.println(empMan.getEmployeesWithLastNameStartingWith("s"));
        System.out.println(empMan.getYoungestEmployee());
        System.out.println(empMan.getOldestEmployee());
    }
}

