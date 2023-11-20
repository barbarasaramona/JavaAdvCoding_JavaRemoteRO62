package org.example.mostenire_polimorfism;

public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Employee ");
        sb.append("name='").append(name).append('\'');
        sb.append(". salary=").append(salary);
        return sb.toString();
    }

    public double calculateSalary() {
        return salary;
    }
}