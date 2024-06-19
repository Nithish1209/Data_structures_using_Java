import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        int[] arr ={ 12,56,23,43,89,90,12,44};
        int n = arr.length;
       Arrays.sort(arr);
        for(int i=0; i<n; i++)
        {
             
             for(int j=0; j<n-1; j++)
             {
                 if(arr[j]%10 > arr[j+1]%10 )
                 {
                     int t=arr[j+1];
                     arr[j+1]=arr[j];
                     arr[j]=t;
                 }
             }
        }
    
    
      for(int i=0; i<n; i++)
      {
         System.out.println(arr[i]);
      }
    
    
    
    } 
}