public class Merge_Sort {
    public static void merge(int arr[],int first,int mid,int last)
    {
        int left = first;
        int rightM = mid + 1;
        int k = 0;
        int[] t = new int[arr.length];
        
        while(left<=mid && rightM<=last)
        {
            if(arr[left]<arr[rightM])
            {
                t[k]=arr[left];
                k++;
                left++;
            }
            else
            {
                t[k]=arr[rightM];
                k++;
                rightM++;
            }
        }
        
        while(left<=mid)
        {
            t[k]=arr[left];
            k++;
            left++;
        }
        while(rightM<=last)
        {
            t[k]=arr[rightM];
            k++;
            rightM++;   
        }
        
        
        left=first;
        k=0;
        while(left<=last)
        { 
            arr[left]=t[k];
            left++;
            k++;
        }
        
    }
    

    public static int[] sort(int arr[],int first,int last)
    {
        if(first<last)
        {
            int mid=(first+last)/2;
            sort(arr,first,mid);
            sort(arr,mid+1,last);
            merge(arr,first,mid,last);
        }
        return arr;
    }
    
    public static void printl(int arr[])
    {
        int n = arr.length;
        for(int i=n-1;i>=0;i--)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
 
    
    public static void main(String[] args) {
        int arr[] = {10,50,40,69,78};
        int n = arr.length;
        System.out.println("before sorting");
        printl(arr);
        
        Merge_Sort obj = new Merge_Sort();
        obj.sort(arr, 0, arr.length-1);
        
        System.out.println("after sorting");
        printl(arr);
        
        
  
    }
    
}
