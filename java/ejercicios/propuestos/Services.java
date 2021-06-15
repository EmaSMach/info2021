package ejercicios.propuestos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class EmployeeManager {
    public static List<Employee> employees = new ArrayList<>();

    public EmployeeManager() {}

    public List<Employee> getEmployees() {
        return employees;
    }

    public void loadEmployeesFromFile(String relPath) {
        String absPath = System.getProperty("user.dir").concat(relPath);
        try (BufferedReader br = new BufferedReader(new FileReader(absPath))) {
            String line = br.readLine();
            while (line != null) {
                Employee newEmp = Employee.fromStringLine(line);
                employees.add(newEmp);
                line = br.readLine();
            }
        }  catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public Employee getLowestPaidEmployee() {
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee emp1, Employee emp2) {
                return emp1.getSalary().compareTo(emp2.getSalary());
            }
        });
        return employees.get(0);
    }

    public Employee getHighestPaidEmployee() {
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee emp1, Employee emp2) {
                return emp1.getSalary().compareTo(emp2.getSalary());
            }
        });
        return employees.get(employees.size() - 1);
    }

    public List<Employee> getEmployeesWithLastNameStartingWith(String pattern) {
        List<Employee> matchingEmployees = new ArrayList<>();
        employees.stream()
            .filter(emp -> emp.getLastName().toLowerCase()
            .startsWith(pattern.toLowerCase()))
            .forEach((emp) -> matchingEmployees.add(emp));
        return matchingEmployees;
    }
}
