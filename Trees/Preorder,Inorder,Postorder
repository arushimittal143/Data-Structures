class Node
{
    int data;
    Node left;
    Node right;
    
    public Node(int d)
    {
        data=d;
        left=right=null;
    }
}
class BinaryTree
{
    Node root;
    BinaryTree()
    {
        root=null;
    }
    public void Postorder(Node node)
    {
        if(node==null)
        return;
        
        Postorder(node.left);
        Postorder(node.right);
        System.out.print(node.data+" ");
    }
     public void Preorder(Node node)
    {
        if(node==null)
        return;
        
        System.out.print(node.data+" ");
        Preorder(node.left);
        Preorder(node.right);
    }
     public void Inorder(Node node)
    {
        if(node==null)
        return;
    
        Inorder(node.left);
       System.out.print(node.data+" ");
        Inorder(node.right);
    }
    public void Preorder()
    {
        Preorder(root);
    }
     public void Inorder()
    {
        Inorder(root);
    }
     public void Postorder()
    {
        Postorder(root);
    }
}
public class Main
{
	public static void main(String[] args)
	{
	    BinaryTree st=new BinaryTree();
	    st.root=new Node(1);
	     st.root.left=new Node(2);
	      st.root.right=new Node(3);
	       st.root.left.left=new Node(4);
	      st.root.left.right=new Node(5);
		System.out.println("Preorder ");
		st.Preorder();
		System.out.println();
		System.out.println("Postorder ");
		st.Postorder();
		System.out.println();
		System.out.println("Inorder ");
		st.Inorder();
		
	}
}
