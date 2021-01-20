public class Main
{
  public static void main (String[]args)
  {
	LinkedList list = new LinkedList ();
  	list.insert (1);
  	list.insert (444);
  	list.insert (7);
  	list.insert (99);
 
  	list.reverse ();
 
  	list.show ();
 
 
  }
}
class Node
{
  int data;
  Node next;
}
class LinkedList
{
  Node head;
  public void insert (int data)
  {
	Node node = new Node ();
  	node.data = data;
  	node.next = null;
	if (head == null)
  	{
          	head = node;
  	}
	else
  	{
          	Node n = head;
          	while (n.next != null)
          	  {
          		n = n.next;
          	  }
          	n.next = node;
  	}
  }
 
  public void reverse ()
  {
	Node current = head;
	Node prev = null, next = null;
	while (current != null)
  	{
          	next = current.next;
          	current.next = prev;
          	prev = current;
          	current = next;
  	}
	head = prev;
  }
  public void show ()
  {
 
	Node node = head;
 
	while (node.next != null)
  	{
 
          	System.out.print (node.data + " ");
          	node = node.next;
  	}
	System.out.println (node.data);
  }
}
