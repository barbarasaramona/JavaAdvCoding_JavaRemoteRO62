package advanced.mostenire_polimorfism;

public class Main {
  public static void main(String[] args) {
    Employee employee = new Employee("John", 235.22);
    Employee employee1 = new Employee("Alex", 3120.50);
    Employee employee2 = new Employee("Mike", 3122.50);
    Manager manager = new Manager("Jake", 3345.90, 800);
    Employee employee4 = new Programmer("Jane", 2590.70, 500);
    Employee employee5 = new Programmer("Mark", 2590.70, 500);

    manager.hires(employee4);
    manager.hires(employee5);
    //System.out.println(employee3.calculateSalary());
    //System.out.println(employee4.calculateSalary());
    System.out.println(manager);
  }
}
