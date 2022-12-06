// Write a program to print the given series n , n-6 , n-12 , n-18 ,...... till
// the value to be printed is greater than Zero(0).
import java.io.*;
import java.util.*;

public class printSeries {

    public static void main(String[] args) throws Exception
     {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=n;i>0;i-=6)
            System.out.print(i+" ");
    }
}