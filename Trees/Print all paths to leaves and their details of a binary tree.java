import java.util.Scanner;
class Node
{
  int data; // data used as key value
  Node leftChild;
  Node rightChild;
  public Node()
  {
    data=0;
  }
  public Node(int d)
  {
    data=d;
  }
}

class Main
{
  static void preOrder(Node root)
  {
    if (root != null)
    {
      System.out.print(root.data + " ");
      preOrder(root.leftChild);
      preOrder(root.rightChild);
    }
  }
  static Node insertLevelOrder(int arr[], Node root, int i, int n)
  {
    if (i < n)
    {
      Node temp = new Node(arr[i]);
      root = temp;
      root.leftChild = insertLevelOrder(arr, root.leftChild, 2 * i + 1, n);
      root.rightChild = insertLevelOrder(arr, root.rightChild, 2 * i + 2, n);
    }
    return root;
  }

  static Node buildTree(int t[], int n)
  {
    Node node = null;
    node = insertLevelOrder(t, node, 0, n);
    return node;
  }
  
  /* class Node {
  int data; // data used as key value
  Node leftChild;
  Node rightChild;
  public Node()  {
    data=0;  }
  public Node(int d)  {
    data=d;  }
 } Above class is declared for use. */
static int count=0;
  static void printAllPaths(Node root) 
  {
	int Path[]=new int[1000];
    printPathsRecur(root,Path,0);
    if(count!=0)
    {
      System.out.println(count);
    }
  }
	static void printPathsRecur(Node node,int Path[],int PathLen)
    {
      if(node==null)
        return;
        Path[PathLen]=node.data;
      PathLen++;
      if(node.leftChild==null && node.rightChild==null)
      {
        PrintArray(Path,PathLen);
        count++;
      }
      else
      {
        printPathsRecur(node.leftChild,Path,PathLen);
        printPathsRecur(node.rightChild,Path,PathLen);
      }
    }
	static void PrintArray(int Path[],int PathLen)
    {
      int i;
      for(i=0;i<PathLen;i++)
      {
        System.out.print(Path[i]+" ");
      }
       System.out.print(PathLen-1);
       System.out.println();
    }
    
    public static void main(String[] args)
  {
    int a[]=new int[10];
    int n, i;
    Scanner s=new Scanner(System.in);
    n = Integer.parseInt(s.nextLine().trim());
    for(i=0;i<n;i++)
      a[i] = Integer.parseInt(s.nextLine().trim());
    Node root = null;
    if(n!=0)
      root = buildTree(a, n);
    printAllPaths(root);
  }
}
