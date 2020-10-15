package com.assignment;
import java.util.Scanner;
import java.lang.*;

public class Employee
{
    Scanner scan = new Scanner(System.in);

    int b_date, b_month, b_year, c_date, c_month, c_year;
    double montly_salary, annual_income, tax;

    public void getDetails()
    {
        System.out.print("\nEnter Current Date [dd] ");
        c_date = scan.nextInt();
        System.out.print("Enter Current Month [mm] ");
        c_month = scan.nextInt();
        System.out.print("Enter Current Year [yyyy] ");
        c_year = scan.nextInt();
        System.out.println("Present Date is: " + c_date + "/" + c_month + "/" + c_year);

        System.out.print("\nEnter Birth Date [dd] ");
        b_date = scan.nextInt();
        System.out.print("Enter Birth Month [mm] ");
        b_month = scan.nextInt();
        System.out.print("Enter Birth Year [yyyy] ");
        b_year = scan.nextInt();
        System.out.println("Birth Date is: " + b_date + "/" + b_month + "/" + b_year);

        System.out.print("\nEnter your monthly salary - ");
        montly_salary = scan.nextDouble();
    }

    public void findAge()
    {
        int month[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (b_date > c_date)
        {
            c_month = c_month - 1;
            c_date = c_date + month[b_month - 1];
        }

        if (b_month > c_month)
        {
            c_year = c_year - 1;
            c_month = c_month + 12;
        }

        int calculated_date = c_date - b_date;
        int calculated_month = c_month - b_month;
        int calculated_year = c_year - b_year;

        System.out.print("Present Age is: ");
        System.out.println(calculated_year + "years " + calculated_month + "months " + calculated_date + "days");
    }

    public void calculateTax()
    {
        annual_income = (montly_salary * 12);
        System.out.println("\nAnnual income of employee is " + annual_income);

        if(annual_income>=500000.0)
        {
            tax = 0.2 * annual_income;
            Double caltax = new Double(tax);
            float tax1 = caltax.floatValue();

            System.out.println("Your income is above 5 Lakh");
            System.out.println("You tax amount is Rs. " + tax1);
        }
        else  if(annual_income>=400000.0 && annual_income<500000.0)
        {
            tax = 0.15 * annual_income;
            Double caltax = new Double(tax);
            float tax1 = caltax.floatValue();

            System.out.println("Your income is above 4 Lakh");
            System.out.println("You tax amount is Rs. " + tax1);
        }
        else  if(annual_income>=300000.0 && annual_income<400000.0)
        {
            tax = 0.1 * annual_income;
            Double caltax = new Double(tax);
            float tax1 = caltax.floatValue();

            System.out.println("Your income is above 3 Lakh");
            System.out.println("You tax amount is Rs. " + tax1);
        }
        else  if(annual_income>=200000.0 && annual_income<300000.0)
        {
            tax =  0.05 * annual_income;
            Double caltax = new Double(tax);
            float tax1 = caltax.floatValue();

            System.out.println("Your income is above 2 Lakh");
            System.out.println("You tax amount is Rs. " + tax1);
        }
        else
        {
            System.out.println("Your income is below 2 Lakh");
            System.out.println("No need to pay Tax!");
        }
    }
}