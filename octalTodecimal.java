 // Write a Java program to convert a octal number to a decimal number.

// Octal number: The octal numeral system is the base-8 number system, and uses the digits 0 to 7.

// Decimal number: The decimal numeral system is the standard system for denoting integer and non-integer numbers. It is also called base-ten positional numeral system.


import java.util.Scanner;
public class octalTodecimal{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        long octal_num=10,decimal_num=0;
        int i=0;
        octal_num=sc.nextInt();
        decimal_num=sc.nextInt();
        while(octal_num!=0)
        {
            decimal_num=(long)(decimal_num+(octal_num%10)*Math.pow(8,i++));
            octal_num=octal_num/10;
        }
        System.out.print(+ decimal_num+"\n");

        
    }
}