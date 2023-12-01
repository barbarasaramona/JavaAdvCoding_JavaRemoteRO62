package advanced.files;

import advanced.mostenire_polimorfism.*;

import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    FileWriter fileWriter = null;
    try {
      fileWriter = new FileWriter("angajati.txt");
      for (int i = 0; i < 4; i++) {
        System.out.print("Introduceti numele si salariul angajatului: ");
        fileWriter.write(scanner.nextLine() + '\n');
      }
    }
    catch (IOException e) {
      throw new RuntimeException(e);
    }
    finally {
      if (null != fileWriter) {
        try {
          fileWriter.close();
        }
        catch (IOException e) {
          throw new RuntimeException(e);
        }
      }
      System.out.println("File closed");
      scanner.close();
      System.out.println("Scanner closed");
    }
    //
    File file = new File("angajati.txt");
    List<Employee> employees = new ArrayList<>();
    Scanner reader = null;
    try {
      reader = new Scanner(file);
      while (reader.hasNextLine()) {
        String[] angajat = reader.nextLine().split(", ");
        Employee employee = new Employee(angajat[0], Double.parseDouble(angajat[1]));
        employees.add(employee);
      }
    }
    catch (FileNotFoundException e) {
      throw new RuntimeException(e);
    }
    finally {
      if (null != reader) {
        reader.close();
      }
    }
    System.out.println(employees);
  }
}
