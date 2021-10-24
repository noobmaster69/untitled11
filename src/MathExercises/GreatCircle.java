package MathExercises;

import java.util.Scanner;

public class GreatCircle {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter point 1's latitude: ");
        double p1L = input.nextDouble();

        System.out.println("Enter point 1's longitude: ");
        double p1Lon = input.nextDouble();

        System.out.println("Enter point 2's latitude: ");
        double p2L = input.nextDouble();

        System.out.println("Enter point 2's longitude: ");
        double p2Lon = input.nextDouble();

        final double radius = 6371.01;

        double distance = radius * Math.acos(Math.sin(p1L) *
                Math.sin(p2L) + Math.cos(p1L) * Math.cos(p2L) *
                Math.cos(p1Lon - p2Lon));

        System.out.println(distance);

    }
}
