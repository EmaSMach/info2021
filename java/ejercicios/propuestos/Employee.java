package ejercicios.propuestos;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;
import java.util.List;

public class Employee {
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private BigDecimal salary;
    
    public Employee() {
        
    }

    public Employee(String firstName, String lastName, LocalDate birthDate, double salary){
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.salary = new BigDecimal(salary);
    }

    public Employee(String firstName, String lastName, String birthDate, String salary){
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = Utils.stringToLocalDate(birthDate);
        this.salary = new BigDecimal(salary);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // birthDate
    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
    
    public void setBirthDate(String birthDate) {
        this.birthDate = Utils.stringToLocalDate(birthDate);
    }

    // age
    public int getAge() {
        return getFullAge().getYears();
    }

    public Period getFullAge() {
        Period date = Period.between(birthDate, LocalDate.now());
        return date;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public void setSalary(double salary){
        this.salary = new BigDecimal(salary);
    }

    @Override
    public String toString() {
        return String.format("%s %s - %s - %f", this.firstName, this.lastName, this.birthDate, this.salary);
    }

    // loaders
    public static Employee fromStringLine(String line) {
        List<String> fields = Arrays.asList(line.split(","));
        Employee emp = new Employee(fields.get(0), fields.get(1), fields.get(2), fields.get(3));
        System.out.print("EMP: ");
        System.out.println(emp);
        return emp;
    }
}
