//Create a class Avenger
// with properties (name,age,power,weapon,planet) and
// with functions-getDetails() and displayDetails().
//Create 5 objects as an array in the main method and call.


package com.assignment;

public class Main
{
    public static void main(String[] args)
    {
        Avengers[] avenger = new Avengers[5];

        for(int i=0; i<5; i++)
        {
            avenger[i] = new Avengers();
            avenger[i].getDetails();
        }
        for(int i=0; i<5; i++)
        {
            avenger[i].displayDetails();
        }
    }
}
