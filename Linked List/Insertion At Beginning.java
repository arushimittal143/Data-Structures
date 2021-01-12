package LinkedList;

public class SingleLinkedLista {
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

       public ListNode insertAtBeginning(ListNode head,int data)
       {
           ListNode newNode=new ListNode(data);
           if(head==null)
           {
               return newNode;
           }
           newNode.next=head;
           head=newNode;
           return head;
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

       SingleLinkedLista list=new SingleLinkedLista();
       ListNode newHead=list.insertAtBeginning(head,15);
       list.display(newHead);

   }

}
