import java.util.Scanner;
public class Main
{
    private node head;
    private node tail;
    private int length;
    
    public Main()
    {
    this.head=null;
    this.tail=null;
    this.length=0;
    }
    
    private class node
     {
        private int data;
        private node next;
        private node previous;
        
        public node(int data)
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
     node newNode=new node(data);
     if(isEmpty())
     {
         head=newNode;
     }
    else
      {
      tail.next=newNode; 
      }
      newNode.previous=tail;
      tail=newNode;
      length++;
     }
     
     public void deleteNode(int pos)
     {
         if(pos<1 || pos>length)
         {
             System.out.println("Enter valid Position");
         }
         else
         {
         if(isEmpty())
           {
             System.out.println("Cannot delete");
           }
         else
           {
             node temp=head;
             int count=1;
             while(count<pos-1)
             {
                 temp=temp.next;
                 count++;
             }
                node current=temp.next;
        		temp.next=current.next;
        		current.next.previous=temp;
        		current.previous=null;
        		current.next=null;
           }
         }
     }
     
     public void show()
     {
     if(head==null)
     {
         return;
     }
     node temp=head;
     while(temp!=null)
     {
         System.out.print(temp.data+" ");
         temp=temp.next;
     }
     }
     
	public static void main(String[] args) {
	int m,n;
    Scanner sc=new Scanner(System.in);
    Main list=new Main();
    n=sc.nextInt();
	while(n>0)
	{
	    m=sc.nextInt();
	    list.insert(m);
	    n--;
	}
	
	System.out.println("Enter Position");
	int pos=sc.nextInt();
	    System.out.println("Print at given Position");
	    System.out.println("After deleting node at given pos: "+pos);
	    list.deleteNode(pos);
	    list.show();
	}
}
