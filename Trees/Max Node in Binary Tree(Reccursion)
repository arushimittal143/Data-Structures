class Node
{
  int data;
  Node left;
  Node right;
  public Node (int d)
  {
    data = d;
    left = right = null;
  }
}
class BinaryTree
{
  Node root;
  int Max ()
  {
    return Max (root);
  }
  public int Max (Node root)
  {
    if (root == null)
      return Integer.MIN_VALUE;
    else
      return Math.max(root.data,Math.max(Max(root.left), Max (root.right)));
  }
}

public class Main
{
  public static void main (String[]args)
  {
    BinaryTree st = new BinaryTree ();
      st.root = new Node (1);
      st.root.left = new Node (90);
      st.root.right = new Node (3);
      st.root.left.left = new Node (4);
      st.root.left.right = new Node (5);
    //Size(root);
      System.out.println ("Max Node " + st.Max ());
  }
}
