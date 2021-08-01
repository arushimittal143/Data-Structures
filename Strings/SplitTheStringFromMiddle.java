import java.util.*;
public class Main
{
    static void split(String s1)
    {
     final int mid = s1.length() / 2; //get the middle of the String
    String[] parts = {s1.substring(0, mid),s1.substring(mid)};
    System.out.println(parts[0]); //first part
    System.out.println(parts[1]); //second part        
    }
	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	String s1=sc.next();
	char ch[]=s1.toCharArray();
	for(int i=0;i<s1.length();i++)
	{
	    if(ch[i]==ch[i+1])
	    {
	    split(s1);
	    break;
	    }
	}
   
	}
}
