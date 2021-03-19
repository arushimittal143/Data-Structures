import java.util.Scanner;
public class MinToMax {
	static void modifyMintoMax(int array[], int n)
	{
	 for (int i = (n-2)/2; i >= 0; --i) 
	       MaxHeapify(array, i, n);
	}
	static void MaxHeapify(int arr[], int i, int n) 
	    { 
	        int l = 2*i + 1; 
	        int r = 2*i + 2; 
	        int largest = i; 
	        if (l < n && arr[l] > arr[i]) 
	            largest = l; 
	        if (r < n && arr[r] > arr[largest]) 
	            largest = r; 
	        if (largest != i) 
	        { 
	            int temp = arr[i]; 
	            arr[i] = arr[largest]; 
	            arr[largest] = temp; 
	            MaxHeapify(arr, largest, n); 
	        } 
	    }
	public static void main(String[] args)
	 {
	  int n, i;
	  Scanner s=new Scanner(System.in);
	   n=s.nextInt();
	    int[] a=new int[n];
	    for(i=0;i<n;i++)
	      a[i] = s.nextInt();
	    modifyMintoMax(a,n);
	    s.close();
	    for(i=0;i<n;i++)
	      System.out.print(a[i] + " ");
	    System.out.println();
	   
	 }
}
