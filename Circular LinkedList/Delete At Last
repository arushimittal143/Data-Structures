import java.util.Scanner;

public class Main {
    private Node last;
    private Node head;
    private int length;
    
    private class Node{
    	private Node next;
    	private int data;
    	public Node(int data)
    	{
    		this.data=data;
    	}
    }
    
    public Main()
    {
    	last=null;
    	length=0;
    }
    public int length()
    {
    	return length;
    }
    public boolean isEmpty()
    {
    	return length==0;
    }
    public void add(int data){  
        Node newNode = new Node(data);    
        if(head == null) {    
            head = newNode;  
            last=newNode;
            last.next=head;
            //last = newNode;  
          //  newNode.next = head; 
            length++;
        }  
        else {   
            last.next = newNode;   
            last = newNode;  
            last.next = head;  
            length++;
        }  
    }
    
    public void deleteAtLast()
    {
    if(isEmpty())
    {
        System.out.println("List is empty");
    }
    else
    {
      Node temp=last.next;
      if(last.next==last)
      {
          last=null;
      }
      else
      {
          Node l=temp;
          while(temp.next!=last)
          {
              temp=temp.next;
          }
          last=temp;
          last.next=l;
          length--;
      }
    }
    }
    
    public void display()
    {
    	if(last==null)
    	{
    		return;
    	}
    	Node first=last.next;
    	while(first!=last)
    	{
    		System.out.print(first.data+" ");
    		first=first.next;
    	}
    	System.out.print(first.data);
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Main list=new Main();
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        while(n>0)
        {
           int m=sc.nextInt();
           list.add(m);
           n--;
        }
        list.deleteAtLast();
        list.display();
        sc.close();
	}

}
