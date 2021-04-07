public class Quick_sort {
    public static int partition(int arr[],int start,int end)
    {
        int pivot = arr[end];
        int i=start;
        for(int j=start;j<end;j++)
        {
            if(arr[j]<=pivot)
            {
                int temp1=arr[j];
                arr[j]=arr[i];
                arr[i]=temp1;
                i++;
            }
                
        }   
                int temp2=arr[i];
                arr[i]=arr[end];
                arr[end]=temp2;
        
        return i;
    }
    
    public static void sort(int arr[],int start,int end)
    {
        if(start<end)
        {
            int p = partition(arr,start,end);
            sort(arr,start,p-1);
            sort(arr,p+1,end);
        }
    }
    
    public static void printl(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] +" ");
            
        }
    }
    
    public static void main(String[] args) {
        int arr[]={44,11,55,22,66,77};
        Quick_sort obj = new Quick_sort();
        int end = arr.length-1;
        obj.sort(arr,0,end);
        
        printl(arr);
    }
    
}
