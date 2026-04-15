package application;

import entities.Employee;
import services.EmployeeService;

import java.util.*;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.println("\n--- Employee Registration ---");
        System.out.print("Number of employees: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            try {
                System.out.println("\nEmployee #" + i);
                System.out.print("Outsourced (y/n)? ");
                char type = sc.next().toLowerCase().charAt(0);

                Employee employee = EmployeeService.createEmployee(type, sc);
                list.add(employee);

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                i--;
            }
        }

        EmployeeService.printPayments(list);
        sc.close();
    }
}