package ejercicios.level2;


import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;

public class Ejer6 {
    public static void main(String[] args) {
        HashSet<Employee> employees = loadEmployees();
        Map<Integer, Integer> salaries = calculateSalary(employees);
        for (Employee employee : employees) {
            System.out.printf("Salary for %s: %d", employee.firstName, salaries.get(employee.getDni()));
            System.out.println();
        }
    }

    public static HashSet<Employee> loadEmployees() {
        Employee emp1 = new Employee("Emanuel", "Sandoval", 3154545, 8, 300);
        Employee emp2 = new Employee("lucas", "Sandoval", 454545, 4, 200);

        HashSet<Employee> employees = new HashSet<>();
        employees.add(emp1);
        employees.add(emp2);
        return employees;
    }

    public static Map<Integer, Integer> calculateSalary(HashSet<Employee> employees){
        Map<Integer, Integer> salaries = new HashMap<>();
        for (Employee emp : employees) {
            salaries.put(emp.getDni(), emp.getSalary());
        }
        return salaries;
    }
}


class Employee {
    String firstName;
    String lastName;
    int dni;
    int hoursOfWork;
    int hourlyValue;

    Employee(String firstName, String lastName, int dni, int hoursOfWork, int hourlyValue){
        this.firstName = firstName;
        this.lastName = lastName;
        this.dni = dni;
        this.hoursOfWork = hoursOfWork;
        this.hourlyValue = hourlyValue;
    }

    public int getSalary(){
        return hourlyValue * hoursOfWork;
    }

    public int getDni() {
        return dni;
    }
}
