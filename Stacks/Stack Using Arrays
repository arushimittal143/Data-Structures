import java.util.Scanner;

public class StacksArrays {
	  private int maxSize; 
	  private int[] stackArray;
	  private int top; 

	  public StacksArrays(int s) 
	  {
	    maxSize = s; 
	    stackArray = new int[maxSize];
	    top = -1;
	  }
	  public void push(int j) 
	  {
	    if(isFull())
	    {
	      System.out.print("OVERFLOW");
	    }
	    else
	    {
	      System.out.println(j + " pushed to stack");
	      stackArray[++top] = j;
	      System.out.println("Top is now at " + top);
	    }
	  }
	  public int pop() 
	  {
	    if (isEmpty())
	    {
	      System.out.println("UNDERFLOW");
	      return -1;
	    }
	    else
	    {
	      int temp=stackArray[top--];
	      System.out.println(temp + " popped from stack");
	      System.out.println("Top is now at " + top);
	      return temp; 
	    }
	  }
	  public boolean isEmpty() 
	  {
	    return (top == -1);
	  }
	  public boolean isFull() 
	  {
	    return (top == maxSize-1);
	  }
	  public static void main(String[] args)
	  {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter size: ");
	    int n=sc.nextInt();
		StacksArrays st = new StacksArrays(n);
	    int temp;
	    st.push(12);
	    st.push(23);
	    temp = st.pop();
	    st.push(54);
	    temp=st.pop();
	    temp=st.pop();
	    temp=st.pop();
	    sc.close();
	  }
}
