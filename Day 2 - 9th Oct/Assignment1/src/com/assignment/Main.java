//Create a class employee. Inside that class create three variable name,age,city.
// Also create a function to display the three variables.
// In the main function create two objects and call the function using it.


package com.assignment;

public class Main {

    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.name = "Chetan";
        emp1.age = 25;
        emp1.city = "Mumbai";
        emp1.display();

        Employee emp2 = new Employee();
        emp2.name = "Akshay";
        emp2.age = 22;
        emp2.city = "Pune";
        emp2.display();
    }
}
