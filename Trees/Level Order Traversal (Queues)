//Without Queues
/*class Node 
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
    public BinaryTree()
    {
        root=null;
    }
    public void printLevelOrder()
    {
        int h=height(root);
        int i;
        for(i=1;i<=h;i++)
        {
            printGivenLevel(root,i);
        }
    }
    public int height(Node root)
    {
        if(root==null)
        {
        return 0;
        }
        else
        {
            int lh=height(root.left);
            int rh=height(root.right);
            
            if(lh>rh)
            return (lh+1);
            else
            return (rh+1);
        }
    }
    public void printGivenLevel(Node root,int level)
    {
        if(root==null)
            return;
        if(level==1)
            System.out.print(root.data+" ");
        else if(level>1)
        {
            printGivenLevel(root.left,level-1);
            printGivenLevel(root.right,level-1);
        }
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
		System.out.println("Level Order Traversal: ");
		st.printLevelOrder();
	}
}*/
//Using Queues:
import java.util.Queue;
import java.util.LinkedList;

class Node {
    int data;
    Node left, right;
 
    public Node(int item) {
        data = item;
        left = null;
        right = null;
    }
}
class BinaryTree {
 
    Node root;
    void printLevelOrder() 
    {
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        while (!queue.isEmpty()) 
        {
            Node tempNode = queue.poll();
            System.out.print(tempNode.data + " ");
            if (tempNode.left != null) {
                queue.add(tempNode.left);
            }
            if (tempNode.right != null) {
                queue.add(tempNode.right);
            }
        }
    }
 
    public static void main(String args[]) 
    {
        BinaryTree tree_level = new BinaryTree();
        tree_level.root = new Node(1);
        tree_level.root.left = new Node(2);
        tree_level.root.right = new Node(3);
        tree_level.root.left.left = new Node(4);
        tree_level.root.left.right = new Node(5);
 
        System.out.println("Level order traversal of binary tree is - ");
        tree_level.printLevelOrder();
    }
}
