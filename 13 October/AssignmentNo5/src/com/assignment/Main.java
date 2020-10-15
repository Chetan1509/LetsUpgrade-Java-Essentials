//Create an int array with 5 values and print only odd values.

package com.assignment;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter five values: ");

        for(int i=0;i<5;i++)
        {
            numbers[i] = scan.nextInt();
        }

        System.out.print("Odd values are: ");
        for(int i=0;i<5;i++)
        {
            if(numbers[i]%2!=0)
            {
                System.out.print(numbers[i] + " ");
            }
        }
    }
}
