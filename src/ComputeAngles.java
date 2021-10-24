import java.util.Scanner;

public class ComputeAngles {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        //Prompt the user to enter three points
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        //Comput three sides
        double a = Math.sqrt((Math.pow((x2-x3),2)) + ((Math.pow((y2-y3),2))));
        double b = Math.sqrt((Math.pow((x1-x3),2)) + ((Math.pow((y1-y3),2))));
        double c = Math.sqrt((Math.pow((x1-x2),2)) + ((Math.pow((y1-y2),2))));

        //Compute three angles
        double A = Math.toDegrees(Math.acos(Math.pow(a,2)
                - Math.pow(b,2) - Math.pow(c,2)))/(-2 * b * c);
        double B = Math.toDegrees(Math.acos(Math.pow(b,2)
                - Math.pow(a,2) - Math.pow(c,2)))/(-2 * a * c);
        double C = Math.toDegrees(Math.acos(Math.pow(c,2)
                - Math.pow(b,2) - Math.pow(a,2)))/(-2 * a * b);

        //Display results
        System.out.println("The three angles are " +
                Math.round(A * 100) / 100.0 + " " +
                Math.round(B * 100) / 100.0 + " " +
                Math.round(C * 100) / 100.0);

    }
}

