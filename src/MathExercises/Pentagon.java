package MathExercises;

import java.util.Scanner;

public class Pentagon {
    public static void main(String[] args){

        System.out.println("Enter the length from the center" +
                "to a vertex: ");
        Scanner input = new Scanner(System.in);

        double length = input.nextDouble();

        double side = (2 * length) * Math.sin(Math.PI/5);

        double numerator = 5 * (Math.pow(side, 2));
        double denominator = 4 * Math.tan(Math.PI/5);

        double area = numerator / denominator;

        System.out.println("The area of the pentagon is " + area);
    }
}
