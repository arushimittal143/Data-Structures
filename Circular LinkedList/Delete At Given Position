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
    
    public void deleteGivenPos(int pos)
    {
    if(isEmpty())
    {
        System.out.println("List is empty");
    }
    if(pos<1 || pos>length+1)
    {
        System.out.println("Invalid");
        return;
    }
    else
    {
        if(pos==1)
        {
           Node temp=last.next;
           if(last.next==last)
           {
               last=null;
           }
           else
           {
               last.next=temp.next;
           }
           temp.next=null;
           length--;
        }
        else
        {
            Node prev=last.next;
            int count=1;
            if(count<pos-1)
            {
                prev=prev.next;
                count++;
            }
            Node c=prev.next;
  		     prev.next=c.next;
  		     c.next=null;
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
        int pos=sc.nextInt();
        list.deleteGivenPos(pos);
        list.display();
        sc.close();
	}

}
