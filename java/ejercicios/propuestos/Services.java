package ejercicios.propuestos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


class EmployeeManager {
    public static List<Employee> employees = new ArrayList<>();

    public EmployeeManager() {}

    public static List<Employee> getEmployees() {
        return employees;
    }

    public List<Employee> getAllEmployees() {
        return null;
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
}




class MyFileReader {
    // private String filePath;
    public BufferedReader br;

    MyFileReader(String filePath) {
        try {
            String absPath = System.getProperty("user.dir").concat(filePath);
            // System.out.println(absPath);
            // System.out.println(filePath);
            this.br = new BufferedReader(new FileReader(absPath));
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            System.exit(1);
        }   
    }

    public String getLine() {
        try {
            String line = br.readLine();
            if (line != null) {
                return line;
            } else {
                return null;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public void close() {
        try {
            br.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public List<String> getLines() {
        List<String> lines = new ArrayList<>();
        String line = this.getLine();
        while (line != null) {
            lines.add(line);
        }
        System.out.println(lines);
        return lines;
    }
}
