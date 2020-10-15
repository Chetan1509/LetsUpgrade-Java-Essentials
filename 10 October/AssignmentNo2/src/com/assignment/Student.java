package com.assignment;
import java.util.Scanner;

public class Student
{
    public void Percentage()
    {
        Scanner scan = new Scanner(System.in);
        int total, english, maths, science, social_studies, language;
        double percentage;

        System.out.println("Enter english Marks out off 100:");
        english = scan.nextInt();
        System.out.println("Enter maths Marks out off 100:");
        maths = scan.nextInt();
        System.out.println("Enter science Marks out off 100:");
        science = scan.nextInt();
        System.out.println("Enter social studies Marks out off 100:");
        social_studies = scan.nextInt();
        System.out.println("Enter language Marks out off 100:");
        language = scan.nextInt();

        total = english + maths + science + social_studies + language;
        System.out.println(total);
        percentage = (total*100)/500;
        System.out.println(percentage);

        if (percentage>=75 && percentage<=100)
        {
            System.out.println("Student scored Distinction with " + percentage + "%.");
        }
        else if (percentage>=60 && percentage<75)
        {
            System.out.println("Student scored First Class with " + percentage + "%.");
        }
        else if (percentage>=45 && percentage<60)
        {
            System.out.println("Student scored Second Class with " + percentage + "%.");
        }
        else if (percentage>=35 && percentage<45)
        {
            System.out.println("Student scored Second Class with " + percentage + "%.");
        }
        else
        {
            System.out.println("Student Failed. Better luck next time!");
        }
    }
}
