
public class DepthFirstTraversal {
	static int[][] mat=new int[4][4];
	static int[] visited=new int[4]; 	   
	   static void addEdge(int m,int n)
	   {
		   mat[m-1][n-1]=1;
		   mat[n-1][m-1]=1;
		   return;
	   }
	   static void printGraph()
	   {
		   int deg=0, i, j;
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
	   static void DFS(int i)
	   {
		 int j;
	     System.out.println(i);
	     visited[i-1]=1;

	     for(j=0;j<4;j++)
	       if((visited[j]==0) && (mat[i-1][j]==1))
	         DFS(j+1);
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
		for(int i=0;i<4;i++)
		{
			visited[i]=0;
		}
	addEdge(1, 2); 
	addEdge(1, 3);
	addEdge(1, 4);
	addEdge(2, 3);
	addEdge(3, 4);

	printGraph(); 
	DFS(4);
	} 
}
