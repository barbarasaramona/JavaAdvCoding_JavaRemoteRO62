package advanced.files;

import advanced.mostenire_polimorfism.Employee;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try {
        FileWriter fileWriter = new FileWriter("angajati.txt");
            Scanner sc = new Scanner(System.in);
            for (int i = 0; i<4;i++) {
            System.out.print("Introduceti numele si salariul angajatului");
            fileWriter.write(sc.nextLine() + "\n");
            sc.close();

        }

        fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        File file = new File("angajati.txt");
        try {
            Scanner sc = new Scanner(file);
            while(sc.hasNext()){
                Scanner[] angajat =sc.nextLine().split(", ");
                        Employee employee = new Employee(angajat[0], Double.parseDouble(angajat[1]));
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException e){
            throw new RuntimeException(e);

        }



    }
}
