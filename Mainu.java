
public class Mainu
{
     public static void quicksort(int[] arr, int s, int e)
     {
         if(s<e)
         {
            int p = findp(arr,s,e);
             quicksort(arr,s,p-1);
             quicksort(arr,p+1,e);
         }
         
         
     }
     
     public static int findp(int[] arr,int s,int e)
     {
          int pv=arr[e];
          int i=s-1;
          for(int j=s; j<e; j++)
          {
              if(arr[j]<pv)
              {
                  i++;
                  int t=arr[i];
                  arr[i]=arr[j];
                  arr[j]=t;
              }
          }
          
          int  t=arr[i+1];
            arr[i+1]=arr[e];
            arr[e]=t;
             return i+1;
          
          
     }
    
    
    
	public static void main(String[] args) 
	{
		int[] arr = {4,9,2,5,7,1,6,8,3};
		 int s=0;
		 int e=arr.length-1;
		 quicksort(arr,s,e);
		 for(int i=0; i<e; i++)
		 {
		     System.out.println(arr[i]);
		 }
		
		
		 
	}
}
