import java.util.*;
public class Prime {
    public static void main(String [] args){
        Scanner rd = new Scanner(System.in);
        System.out.println("Enter aa number . .. :");
         int n = rd.nextInt();

         for(int j=; j<n; j++)
         for(int i=2; i<n; i++)
         {
            if(n%i!=0)
            {
                System.out.println(i+"is a  prime number");
        
            
            }
         
         }
    }
    
    
}
