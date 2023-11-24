package advanced.files;

import advanced.mostenire_polimorfism.*;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            FileWriter fileWriter = new FileWriter("angajati.txt");
            for (int i = 0; i < 4; i++) {
                System.out.print("Introduceti numele si salariul angajatului: ");
                fileWriter.write(sc.nextLine() + '\n');
            }
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            sc.close();
            System.out.println("Scanner closed");
        }

        File file = new File("angajati.txt");
        List<Employee> employees = new ArrayList<>();
        Scanner scRead = null;
        try {
            scRead = new Scanner(file);
            while (scRead.hasNextLine()) {
                String[] angajat = scRead.nextLine().split(", ");
                Employee employee = new Employee(angajat[0], Double.parseDouble(angajat[1]));
                employees.add(employee);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            scRead.close();
        }
        System.out.println(employees);
    }
}
