import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n1=sc.nextInt();
            int m1=sc.nextInt();
            int arr1[][]=new int[n1][m1];
            for(int i=0;i<n1;i++)
            {
                for(int j=0;j<m1;j++)
                {
                    arr1[i][j]=sc.nextInt();
                }
            }
            int n2=sc.nextInt();
            int m2=sc.nextInt();
            int arr2[][]=new int[n2][m2];
            for(int i=0;i<n2;i++)
            {
                for(int j=0;j<m2;j++)
                {
                    arr2[i][j]=sc.nextInt();
                }
            }
            int arr3[][]=new int[n1][m2];
            for(int i=0;i<n1;i++)
            {
                for(int j=0;j<m2;j++)
                {
                   arr3[i][j]=0;
                    for(int k=0;k<n2;k++)
                    {
                        arr3[i][j]+=arr1[i][k]*arr2[k][j];
                         
                    }
                    System.out.print(arr3[i][j]+" ");
                }
                System.out.println();
            } 
        }
    }
}
