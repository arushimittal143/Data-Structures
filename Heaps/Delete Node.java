import java.util.Scanner;

public class DeleteNode {
	static int heap[]=new int[100];
	  static int heapSize = -1;
	  static void Insert(int element) 
	  {
	    heapSize++;
	    heap[heapSize] = element; 
	    int now = heapSize;
	    while (heap[(now-1) / 2] > element) 
	    {
	      heap[now] = heap[(now-1) / 2];
	      now = (now-1) / 2;
	    }
	    heap[now] = element;
	  }

	  static int DeleteMin() 
	  {
	    int minElement, lastElement, child, now;
	    minElement = heap[0];
	    lastElement = heap[heapSize--];
	    for (now = 0; now * 2 < heapSize; now = child) 
	    {
	      child = now * 2 + 1;
	      if (child != heapSize && heap[child + 1] < heap[child])
	        child++;
	      if (lastElement > heap[child])
	        heap[now] = heap[child];
	      else 
	    	  break;
	    }
	    heap[now] = lastElement;
	    return minElement;
	  }
	  static void printHeap()
	  {
		  for(int i=0;i<=heapSize;i++)
		  {
			  System.out.print(heap[i]+" ");
		  }
		  System.out.println();
	  }
	  public static void main(String ab[]) 
	  {
	    int i;
	    Scanner s=new Scanner(System.in);
	    int n;
	    n=s.nextInt();
	    int[] arr=new int[n];
	    for(i=0;i<n;i++)
	    {
	    	arr[i]=s.nextInt();
	    	Insert(arr[i]);
	    }
	    printHeap();
	    System.out.println("Enter number of elements to delete: ");
	    int d=s.nextInt();
	    for(i=0;i<d;i++)
	    	System.out.print(DeleteMin()+" ");
	    System.out.println();
	    System.out.println("New Heap: ");
	    printHeap();
	    s.close();
	  }
}
