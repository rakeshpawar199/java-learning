//Write a Java program that takes a number as input and prints its multiplication table upto 10.

// Test Data:
// Input a number: 8

import java.util.Scanner;
public class table {
    public static void main(String[]args)
    {

  
    Scanner sc=new Scanner(System.in);
int num1=sc.nextInt();
for(int i=0;i<10;i++)
{
    System.out.println(num1 + " x " + (i+1) + " = " + 
     (num1 * (i+1)));
}

    }
    
}
