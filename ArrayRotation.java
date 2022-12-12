//Array Rotation
// John Watson knows of an operation called a right circular rotation on an array of integers. One rotation operation moves the last array element to the first position and shifts all remaining elements right one. To test the abilities of Sherlock , Watson provides Sherlock with an array of integers. Sherlock is to perform the rotation operation a number of times then determine the value of the element at a given position.

// For each array, perform k number of right circular rotations and return the values of the elements at the given indices in array queries.

// Input Format
// The first line contains 3 space-separated integers n, k & q the number of elements in the integer array, the rotation count and the number of queries.

// The second line contains n space-separated integers, describing elements in arr.

// The third line contains q space-separated integers, describing elements in queries

// Output Format
// Return the array containing values of the elements at the given indices in array queries.
import java.util.*;
import java.lang.*;
import java.io.*;
public class ArrayRotation {
    public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
    Scanner sc = new Scanner(System.in);
    int n,k,m;
    n=sc.nextInt();
    k=sc.nextInt();
    m=sc.nextInt();
    int arr[]=new int [n];
   int newArr[]=new int [n];
    for(int i=0;i<n;i++)
    {
      arr[i]=sc.nextInt();
    }
    for(int i=0;i<n;i++)
    {
      int newIndex=(i+k)%n;
       newArr[newIndex]=arr[i];
     }
    for(int i=0;i<m;i++)
    {
      int index=sc.nextInt();
       System.out.println(newArr[index]);
    }
    
	}
}
    

