package Recursion;

public class ArraySum {

    public int sumOfArray(Integer[] a, int index)
    {

        //Base Case, made base case -1
        if (index == -1)
            return 0;
        else
            //Recursion method
            return a[index] + sumOfArray(a, index-1);
    }
}
