package services;

import entities.Employee;
import entities.OutsourceEmployee;

import java.util.*;

public class EmployeeService {

    public static Employee createEmployee(char type, Scanner sc) {

        System.out.print("Name: ");
        sc.nextLine();
        String name = sc.nextLine();

        if (name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }

        int hours = readPositiveInt(sc, "Hours worked: ");
        double valuePerHour = readPositiveDouble(sc, "Value per hour: ");

        if (type == 'y') {
            double additionalCharge = readPositiveDouble(sc, "Additional charge: ");
            return new OutsourceEmployee(name, hours, valuePerHour, additionalCharge);
        }

        return new Employee(name, hours, valuePerHour);
    }

    public static void printPayments(List<Employee> list) {
        System.out.println("\n--- Payments ---");
        for (Employee e : list) {
            System.out.printf("%s - $%.2f%n", e.getName(), e.payment());
        }
    }

    private static int readPositiveInt(Scanner sc, String message) {
        while (true) {
            System.out.print(message);
            String input = sc.next();
            try {
                int value = Integer.parseInt(input);
                if (value <= 0) {
                    System.out.println("Value must be greater than zero.");
                    continue;
                }
                return value;
            } catch (NumberFormatException e) {
                System.out.println("Invalid number.");
            }
        }
    }

    private static double readPositiveDouble(Scanner sc, String message) {
        while (true) {
            System.out.print(message);
            String input = sc.next();
            try {
                double value = Double.parseDouble(input);
                if (value <= 0) {
                    System.out.println("Value must be greater than zero.");
                    continue;
                }
                return value;
            } catch (NumberFormatException e) {
                System.out.println("Invalid number.");
            }
        }
    }
}