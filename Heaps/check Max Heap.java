import java.util.Scanner;
public class checkMaxHeap {
	static int isMaxHeap(int arr[], int n)
	{
	   int i,found=1;
	  if(n==2)
	  {
	    if(arr[0]<arr[1])
	    {
	      found=0;
	    }
	  }
	  for(i=0;i<(n-2)/2;i++)
	  {
	    if(arr[(2*i)+1]<arr[i] && arr[(2*i)+2]<arr[i])
	    {
	      found=1;
	    }
	    else
	    {
	      found=0;
	    }
	  }
	  return found;
	}
	public static void main(String[] args)
	 {
	  int n, i;
	  Scanner s=new Scanner(System.in);
	    n=s.nextInt();
	    int[] a=new int[n];
	    for(i=0;i<n;i++)
	      a[i] = s.nextInt();
	    System.out.println(isMaxHeap(a, n));
	    s.close();
	 }
}
