import java.util.Scanner;


public class InsertionAtGivenPos {
	private static class Node{
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;
		}
	}

	static Node insertEnd(Node head,int data)
   {
	   Node newNode=new Node(data);
	   Node last=head;
	   newNode.next=null;
	   if(head==null)
	   {
		   head=newNode;
		   return head;
	   }
	   while(last.next!=null)
	   {
		   last=last.next;
	   }
	   last.next=newNode;
	   return head;
   }
   static void display(Node head)
   {
	   Node current=head;
	   if(head==null)
	   {
		   return;
	   }
	   while(current!=null)
	   {
		   System.out.print(current.data+" -> ");
		   current=current.next;
	   }
	   System.out.print(current);
	   
   }
   static Node insertAtPosition(Node head,int data,int pos)
   {
	   
	   Node current=head;
	   int length=0;
	   while(current!=null)
	   {
		   current=current.next;
		   length++;
	   }
	   if(pos<1 || pos>length+1)
	   {
		   System.out.println("Invalid Position");
		   return head;
	   }
	   else
	   {
		   Node newNode=new Node(data);
		   if(pos==1)
		   {
			   newNode.next=head;
			   return newNode;
		   }
		   Node prev=head;
		   int count=1;
		   while(count<pos-1)
		   {
			   prev=prev.next;
			   count++;
		   }
		   Node c=prev.next;
		   newNode.next=c;
		   prev.next=newNode;
		   
		   return head;
	   }
   }
	public static void main(String[] args)
   {
	   int n,m;
	   Scanner s=new Scanner(System.in);
	   Node head=null;
	   n=s.nextInt();
	   while(n>0)
	   {
		   m=s.nextInt();
		   head=insertEnd(head,m);
		   n--;
	   }
	   System.out.println("Enter position:");
	   int pos;
	   int d;
	   pos=s.nextInt();
	   System.out.println("Enter node:");
	   d=s.nextInt();
	   System.out.println("Before Insertion at given position: ");
	   display(head);
	   head=insertAtPosition(head,d,pos);
	   System.out.println("After Insertion at given position: ");
	   display(head);
	   s.close();
   }
}
