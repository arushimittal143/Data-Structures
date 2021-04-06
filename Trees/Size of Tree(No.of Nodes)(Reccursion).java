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
  int Size ()
  {
    return Size (root);
  }
  public int Size (Node root)
  {
    if (root == null)
      return 0;
    else
      return (1 + Size (root.left) + Size (root.right));
  }
}

public class Main
{
  public static void main (String[]args)
  {
    BinaryTree st = new BinaryTree ();
      st.root = new Node (1);
      st.root.left = new Node (2);
      st.root.right = new Node (3);
      st.root.left.left = new Node (4);
      st.root.left.right = new Node (5);
    //Size(root);
      System.out.println ("Size " + st.Size ());
  }
}
