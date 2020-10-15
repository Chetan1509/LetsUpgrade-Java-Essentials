//Take employee name, date of birth, month of birth, birth year, monthly salary;
//        5lpa - 20%;
//        4lpa - 15%;
//        3lpa- 10%;
//        2lpa -5%;
//Display name, age, annual income and the tax amount.


package com.assignment;
import com.assignment.Employee;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String name;
        System.out.print("Enter your name ");
        name = scanner.nextLine();

        Employee employee = new Employee();
        employee.getDetails();
        System.out.println("\nEmployee name is - " + name);
        employee.findAge();
        employee.calculateTax();
    }
}