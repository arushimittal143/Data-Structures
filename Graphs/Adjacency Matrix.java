
public class AdjacencyMatrix {
	static int[][] mat=new int[4][4];
   static void addEdge(int m,int n)
   {
	   mat[m-1][n-1]=1;
	   return;
   }
   static void printGraph()
   {
	   int deg=0, i, j;
	    System.out.println("\n\n ADJACENCY MATRIX\n\t");
	    for (i = 0; i < 4; i++)
	      System.out.print("\t" + (i+1));
	    System.out.println();
	    for (i = 0; i <4; i++)
	    {
	      System.out.print("\n" + (i+1) + "\t");
	      for (j = 0; j <4; j++)
	      {
	        System.out.print(mat[i][j] + "\t");
	        if(mat[i][j] != 0)
	          deg++;
	      }
	    }
	    System.out.println("\n\nTotal Edges in Graph are: " + (deg/2));
   }

public static void main(String[] args) 
{   
	for(int i=0;i<4;i++)
	{
		for(int j=0;j<4;j++)
		{
			mat[i][j]=0;
		}
	}
addEdge(1, 2); 
addEdge(1, 3); 
addEdge(1, 4); 
addEdge(2, 3); 
addEdge(2, 1); 
addEdge(3, 1); 
addEdge(3, 2);
addEdge(3, 4);
addEdge(4, 1);
addEdge(4, 3);

printGraph(); 
} 
}
