import java.io.*;
import java.util.*;

public class Main
{

  public static void main (String[]args)
  {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt ();
    int a[] = new int[n];
    int b[] = new int[100];
    for (int i = 0; i < n; i++)
      {
	a[i] = sc.nextInt ();
	b[i] = -1;
      }
    int i, j;
    for (i = 0; i < n; i++)
      {
	int count = 1;
	for (j = i + 1; j < n; j++)
	  {
	    if (a[i] == a[j])
	      {
		count++;
		b[j] = 0;
	      }
	  }

	if (b[i] != 0)
	  {
	    b[i] = count;
	  }
      }

    for (i = 0; i < n; i++)
      {
	if (b[i] == 1)
	  {
	    System.out.print (a[i] + " ");
	  }
      }
  }
}
