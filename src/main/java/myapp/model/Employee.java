package myapp.model;

import java.time.LocalDate;
import java.util.UUID;

public class Employee {
    private static int counter = 0;

    private final int id;
    private String name;
    private LocalDate startDate;
    private double salary;
    private int departmentID;

    public Employee(int id, String name, LocalDate startDate, double salary, int departmentID) {
        this.id = id;
        this.name = name;
        this.startDate = startDate;
        this.salary = salary;
        this.departmentID = departmentID;
    }

    public Employee(String name, LocalDate startDate, double salary, int departmentID) {
        this.id = ++counter;
        this.name = name;
        this.startDate = startDate;
        this.salary = salary;
        this.departmentID = departmentID;
    }

    private Employee(Employee employee) {
        this.id = employee.id;
        this.name = employee.name;
        this.startDate = employee.startDate;
        this.salary = employee.salary;
        this.departmentID = employee.departmentID;
    }

    public Employee makeCopy(){
        return new Employee(this);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(int departmentID) {
        this.departmentID = departmentID;
    }

}
