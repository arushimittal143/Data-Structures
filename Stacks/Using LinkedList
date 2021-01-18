public class stack_LinkedList {

    Node top;
    

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
    
    public boolean isEmpty() {
        if (top == null) {
            return true;
        } else return false;
    }
    
    public void push(int data) {
        Node temp = new Node(data);

        if (top == null) {
            top = temp;
        } else {
             //temp = new Node(data);
            temp.next=top;
            top=temp;
        }
        System.out.println(data + " pushed to stack");
    }

    public int pop() {
        int res = 0;
        if (top == null) {
            System.out.println("Stack is Empty");
        } else {
             res  = top.data;
            top = top.next;
        }
        return res;
    }

    public int peek() {
        if (top == null) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return top.data;
        }
        
    }

    public static void main(String[] args) {
        
        stack_LinkedList sll = new stack_LinkedList();

        sll.push(10);
        sll.push(20);
        sll.push(30);

        System.out.println(sll.pop() + " popped from stack");
    
        System.out.println("Top element is " + sll.peek());
        
    }
}
