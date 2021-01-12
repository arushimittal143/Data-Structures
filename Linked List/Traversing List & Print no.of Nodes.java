package LinkedList;

public class SingleLinkedList {
   //private ListNode head;

   public static class ListNode
   {
       private int data;
       private ListNode next;

       public ListNode(int data)
       {
           this.data=data;
           this.next=null;
       }
   }

   public int countofnodes(ListNode head)
   {
       ListNode current=head;
       if(head==null) {
           return 0;
       }
       int count=0;
       while(current!=null)
       {
           count++;
           current=current.next;
       }
       return count;
   }

   public void display(ListNode head)
   {
       ListNode current=head;
   if(head==null) {
   return;
   }
   while(current!=null)
   {
       System.out.print(current.data+" ");
       current=current.next;
   }
       System.out.println();
   }
   public static void main(String[] args) {
       ListNode head=new ListNode(10);
       ListNode second=new ListNode(8);
       ListNode third=new ListNode(1);
       ListNode fourth=new ListNode(11);

       //Attach them together

       head.next=second;
       second.next=third;
       third.next=fourth;

       SingleLinkedList list=new SingleLinkedList();
       list.display(head);
       System.out.println("Length of list: "+list.countofnodes(head));
   }

}
