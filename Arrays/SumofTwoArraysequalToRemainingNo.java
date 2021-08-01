*******************************************************************************/
import java.util.*;
public class Main
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int n=sc.nextInt();
        int arr[]=new int[n];
        int f=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int sum=0;
         for(int i=0;i<n;i++)
        {
           sum=sum+arr[i];
        }
        System.out.println(sum);
        for(int i=0;i<n;i++)
        {
            for(int j=1;j<n;j++)
            {
                if((arr[i]+arr[j])==(sum-(arr[i]+arr[j])))
                {
                f=1;
                break;
                }
            }
        }
        if(f==1)
         System.out.println("YES");
         else
         System.out.println("NO");
    }
}
 
