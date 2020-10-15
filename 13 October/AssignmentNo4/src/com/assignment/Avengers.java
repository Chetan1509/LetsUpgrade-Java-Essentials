package com.assignment;

import java.util.Scanner;

public class Avengers
{
    Scanner scan = new Scanner(System.in);
    String name, power, weapon, planet;
    int age;

    public void getDetails()
    {
        System.out.println("\nEnter Avenger Details: ");

        System.out.print("Enter Name: ");
        name = scan.next();
        System.out.print("Enter Age: ");
        age = scan.nextInt();
        System.out.print("Enter Power: ");
        power = scan.next();
        System.out.print("Enter Weapon: ");
        weapon = scan.next();
        System.out.print("Enter Planet: ");
        planet = scan.next();
    }

    public void displayDetails()
    {
        System.out.println("Avenger name is " + name + ". Avenger age is " + age + ". Avenger power is " + power +
                ". Avenger weapon is " + weapon + ". Avenger planet is " + planet + ".");
    }
}
