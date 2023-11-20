package advanced.mostenire_polimorfism;

public class Programmer extends Employee {

  private double overtime;

  public Programmer(String name, double salary, double overtime) {
    super(name, salary);
    this.overtime = overtime;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("Programmer ");
    sb.append(" name = ").append(getName());
    sb.append(" base salary = ").append(getSalary());
    sb.append(" overtime= ").append(overtime);
    return sb.toString();
  }

  @Override
  public double calculateSalary() {
    return super.calculateSalary() + overtime;
  }
}
