  
import java.util.ArrayDeque;

public class BreadthFirstTraversal {
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
	   static void BFS(int v)
	   {
	     int i;
	     ArrayDeque<Integer> q=new ArrayDeque<Integer>();
	     q.add(v);
	     while(q.peek() != null)
	     {
	       v = q.poll();
	       if(visited[v-1]==0)
	         System.out.println(v);
	       visited[v-1] = 1;
	       for(i=0; i<4; i++)
	         if((mat[v-1][i] == 1) && (visited[i])==0)
	           q.add(i+1);
	     }
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
		BFS(4);
		} 
}
