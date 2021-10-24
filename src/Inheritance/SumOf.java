package Inheritance;

public class SumOf {
    public static void main(String[] args){

        sumOf(100);
        System.out.println("And I am done");

    }

    public static int sumOf(int n){

        int sum;
        if(n == 1){
            sum = 1;
        }
        else {
            sum = sumOf(n - 1) + n; //Recursive call
        }

        System.out.println("Sum given " + n + " is: " + sum);
        return sum;
    }
}
