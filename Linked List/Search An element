public class Main
{
          	public static void main(String[] args) {
                         	LinkedList list=new LinkedList();
                         	 list.insert(1);
                         	 list.insert(444);
                         	 list.insert(7);
                         	 list.insert(99);
                         	 
                         	 list.search(99);
                         	 
                         	 
          		
          	}
}
class Node{
	int data;
	Node next;
}
class LinkedList
{
 Node head;
	public void insert(int data)
	{
    	Node node =new Node();
    	node.data=data;
    	node.next=null;
    	if(head==null)
    	{
        	head=node;
    	}
    	else
    	{
        	Node n=head;
        	while(n.next!=null)
        	{
            	n=n.next;
        	}
        	n.next=node;
    	}
	}
	public void search(int x)
	{
    	Node current=head;
    	int flag=0,i=0;
    	if(head==null)
    	{
     	   System.out.print("linked list is empty");
    	}
    	
    	else
    	{
        	while(current!=null)
        	{
            	if(current.data==x)
            	{
                	flag=1;
                	break;
         	   }
            	i++;
            	current=current.next;
        	}
        	if(flag==0)
        	{
                System.out.print("Element is not present");
        	}
        	else
        	{
                System.out.print("Element is present at position "+ i);
        	}
    	}
    	
}
