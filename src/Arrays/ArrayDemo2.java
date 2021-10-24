package Arrays;

import java.util.Scanner;

public class ArrayDemo2 {
    public static void main(String[] args){

        final int EMPLOYEES = 3; //Number of employees
        int[] hours = new int[EMPLOYEES]; //Array of hours

        //Create a Scanner objct for keyboard input
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the hours worked by " +
                EMPLOYEES + " employees");

        //Get the hours for each employee
        for(int i = 0; i < EMPLOYEES; i++)
        {
            System.out.print("Employee  "  +(i+ 1) + ": ");
            hours[i] = input.nextInt();
        }

        System.out.println("The hours you entered are:");

        //Display the values entered
        for(int i = 0; i < EMPLOYEES; i++)
            System.out.println(hours[i]);

    }
}
