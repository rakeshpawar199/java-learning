//Print series n, n-3k, n-6k, n-12k...
import java.io.*;
import java.util.*;

public class printSeriesofN {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        for(int i=n;i>0;i-=3*k)
        {
          
           System.out.print(i+" ");
        }
    }
}
}
