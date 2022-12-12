// Sigma of Equation
// Given a number N, find the value of the below equation for the given number.

// Equation
// N
// ∑  {(X + 1)^2 - (3X + 1) + X}
// X = 1
// Input Format
// First line contains an integer n

// Output Format
// Single line output of a number x
import java.util.*;

import java.io.*;

public class  SigmaEquqtion
{
	public static void main (String[] args) throws java.lang.Exception
	{
		long sum=0; // create a veriable for store the value of  equetion 
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(long i=0;i<=n;i++) // start loop from o to n;
    {
  sum=sum+((i+1)*(i+1)-(3*i+1)+i); //  put value in formula 
    }
    System.out.print(sum); // print final answer;
	}
}