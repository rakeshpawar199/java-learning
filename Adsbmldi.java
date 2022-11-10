//  Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers. Go to the editor
// Test Data:
// Input first number: 125
// Input second number: 24
// Expected Output :
// 125 + 24 = 149
// 125 - 24 = 101
// 125 x 24 = 3000
// 125 / 24 = 5
// 125 mod 24 = 5
import java.util.Scanner;
public class Adsbmldi {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int  num1=125;
        int num2=24;
        num1=sc.nextInt();
        num2=sc.nextInt();
        int add=num1+num2;
        int sub=num1-num2;
        int  mul=num1*num2;
        int div=num1/num2;
        int rem=num1%num2;
        System.out.printf("add = %d\nsub = %d\nMul = %d\nSub = %d\nDiv = %d\nRem \n ", add, sub, mul, div, rem);
    }
    
}
