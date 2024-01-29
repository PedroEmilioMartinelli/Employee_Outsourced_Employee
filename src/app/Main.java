package app;

import entitis.Employee;
import entitis.OutsourcedEmployee;

import javax.swing.plaf.ScrollPaneUI;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        List<Employee> list = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            System.out.println("Employee #" + i + " data :");
            System.out.print("Outsourced (y/n)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.print("Value per hour: ");
            double valuePerHours = sc.nextDouble();
            if (ch == 'y' || ch == 'Y'){
                System.out.print("Additional Charge: ");
                double additionalCharge = sc.nextDouble();
                list.add(new OutsourcedEmployee(name, hours, valuePerHours, additionalCharge));
            }
            else {

                list.add(new Employee(name, hours, valuePerHours));

            }


        }

        System.out.println();
        System.out.println("Payment: ");
        for(Employee emp : list){
            System.out.println(emp.getName() + " - $ " +String.format("%.2f" ,emp.payment()));
        }




            sc.close();


    }
}
