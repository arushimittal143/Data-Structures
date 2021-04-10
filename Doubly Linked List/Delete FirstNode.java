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
     
     public void deleteAtBegin()
     {
         if(isEmpty())
         {
             System.out.println("Cannot delete");
         }
         else
         {
          node temp=head;
          if(head==tail)
          {
              tail=null;
          }
          else
          {
          head.next.previous=null;    
          }
          head=head.next;
          temp.next=null;
          length--;
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
	list.deleteAtBegin();
	
	    System.out.println("Delete node at Beginning");
	    list.show();
	}
}
