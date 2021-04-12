import java.util.Scanner;
public class Main
{
    private Node head;
    private Node tail;
    private int length;
    
    public Main()
    {
    this.head=null;
    this.tail=null;
    this.length=0;
    }
    
    private class Node
    {
        private int data;
        private Node previous;
        private Node next;
        
        public Node(int data)
        {
            this.data=data;
        }
    }
    
    public boolean isEmpty()
    {
       return length==0; 
    }
    
    public int length()
    {
       return length; 
    }
    
    public void insert(int data)
    {
        Node newnode=new Node(data);
        if(isEmpty())
        {
            head=newnode;
        }
        else
        {
            tail.next=newnode;
        }
        newnode.previous=tail;
        tail=newnode;
        length++;
    }
    
    public void displayForward()
    {
        if(head==null)
        {
            System.out.println("List is Empty");
        }
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    
     public void displayBackward()
    {
        if(tail==null)
        {
            return;
        }
        Node temp=tail;
        while(temp!=null)
        {
             System.out.print(temp.data+" ");
            temp=temp.previous;           
        }
    }
    
	public static void main(String[] args) {
	    int n,m;
    Scanner sc=new Scanner(System.in);
    Main list=new Main();
    n=sc.nextInt();
    while(n>0)
    {
        m=sc.nextInt();
        list.insert(m);
        n--;
    }
    System.out.println("In forward direction: ");
    list.displayForward();
    System.out.println("");
    System.out.println("In backward direction: ");
    list.displayBackward();
    sc.close();
	}
}
