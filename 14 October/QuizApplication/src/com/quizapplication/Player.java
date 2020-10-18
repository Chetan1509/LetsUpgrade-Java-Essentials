package com.quizapplication;
import java.util.Scanner;

public class Player
{
    Scanner scan = new Scanner(System.in);
    String name;
    int score=0;

    public void getDetails()
    {
        System.out.print("Enter player name: ");
        name = scan.next();
    }
}
