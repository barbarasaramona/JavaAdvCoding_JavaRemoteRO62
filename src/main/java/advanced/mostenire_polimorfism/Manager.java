package advanced.mostenire_polimorfism;

import java.util.*;

public class Manager extends Employee {
  private double bonus;
  private List<Employee> employees;

  public Manager(String name, double salary, double bonus) {
    super(name, salary);
    this.bonus = bonus;
    this.employees = new ArrayList<>();
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder();
//        sb.append(super.toString());
    sb.append(" Manager ");
    sb.append(" name = ").append(getName());
    sb.append(" base salary = ").append(getSalary());
    sb.append(" bonus= ").append(bonus);
    sb.append(" employees = ").append(employees);
    return sb.toString();
  }

  @Override
  public double calculateSalary() {
    return (super.calculateSalary() + bonus);
  }

  public void hires(Employee employee) {
    employees.add(employee);
  }
}
