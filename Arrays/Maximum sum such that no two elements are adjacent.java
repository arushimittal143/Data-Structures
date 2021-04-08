/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	int FindMaxSum(int arr[], int n)
    {
        int incl = arr[0];
        int excl = 0;
        int excl_new;
        int i;
  
        for (i = 1; i < n; i++)
        {
        	
            /* current max excluding i */
            excl_new=Math.max(incl,excl);
  
            /* current max including i */
            incl = excl + arr[i];
            excl = excl_new;
        }
  
        /* return max of incl and excl */
        return Math.max(incl,excl);
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		 Ideone sum = new Ideone();
        int arr[] = new int[]{5, 5, 10, 100, 10, 5};
        System.out.println(sum.FindMaxSum(arr, arr.length));
	}
}
