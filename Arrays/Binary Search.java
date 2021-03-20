import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
 int n=sc.nextInt();
 int a[]=new int[n];
 for(int i=0;i<n;i++)
 {
 a[i]=sc.nextInt();
 }
 int start=0;
 int end=a.length-1;
 int mid=(start+end)/2;
 int skey=sc.nextInt();
 int index;
 while(start<=end && a[mid]!=skey)
 {
 if(skey<a[mid])
 {
 end=mid-1;
 }
 else
 start=mid+1;
 mid=(start+end)/2;
 }
 if(a[mid]==skey)
 {
 index=mid;
 System.out.println("Element "+skey+" found at index "+ index);
 }
 else
 {
 index=-1;
 System.out.println("Element not found");
 }
}
}
