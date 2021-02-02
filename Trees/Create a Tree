class Node
{
 int data;
 Node leftchild;
 Node rightchild;
 
 public Node()
 {
     data=0;
 }
 public Node(int d)
 {
     data=d;
 }
}
public class Main
{
	public static void main(String[] args) {
	Node root=new Node(0);
	root.leftchild=new Node(1);
	root.rightchild=new Node(2);
	
	System.out.println("root "+root.data);
	System.out.println("leftchild "+root.leftchild.data);
	System.out.println("rightchild "+root.rightchild.data);
	
	root.leftchild.leftchild=new Node(13);
	root.leftchild.rightchild=new Node(14);
	
	System.out.println("leftchild to leftchild "+root.leftchild.leftchild.data);
	System.out.println("leftchild to rightchild "+root.leftchild.rightchild.data);
	
	root.rightchild.leftchild=new Node(25);
	root.rightchild.rightchild=new Node(26);
	
	System.out.println("rightchild to leftchild "+root.rightchild.leftchild.data);
	System.out.println("rightchild to rightchild "+root.rightchild.rightchild.data);
	}
}
