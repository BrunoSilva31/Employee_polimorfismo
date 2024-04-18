package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.*;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        Integer n = sc.nextInt();
        
        for(int i = 0; i < n; i++){

            System.out.println("Employee #" + (i + 1) + " :");
            System.out.print("Outsourced (y/n) ? ");
            char res = sc.next().charAt(0);

            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Hours: ");
            Integer hours = sc.nextInt();

            System.out.print("Value per Hour: ");
            Double valuePerHour = sc.nextDouble();

            if(res == 'y'){
                System.out.print("Additional charge: ");
                Double additionalCharge = sc.nextDouble();

                Employee emp = new OutSourcedEmployee(name, hours, valuePerHour, additionalCharge);

                list.add(emp);

            } else {
                Employee emp = new Employee(name, hours, valuePerHour);

                list.add(emp);
            }
        }

        System.out.println();
        System.out.println("PAYMENTS: ");
        for (Employee emp : list) {
            System.out.println(emp.getName() + " - R$" + String.format("%.2f", emp.payment()));
        }
        
        sc.close();
    }
}
