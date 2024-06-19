import java.util.*;
class Node{
    String  val;
    Node next;
    Node(String val)
    {
         this.val = val;
         this.next =null;
    }
}


class strlist
{
   
    Node head;
     
      strlist()
      {
          this.head=null;
      }



     void insert(String val)
     {
          Node newnode = new Node(val);
         if( head == null)
         {
            head =newnode;
         } 
         else
         {
              Node current = head;
              
               while(current.next != null)
               {
                   current = current.next;
               }
               current.next=newnode;
              
         }
         
          
     }
     
    

    void display()
    {
         Node c = head;
        while(c != null )
        {
     System.out.println(c.val);
          c = c.next;
        }

    }
    
    
}




public class Main
{
	public static void main(String[] args) 
	{
	 	System.out.println("Hello World");
     	strlist  ob = new strlist();
     	ob.insert("nithish");
     	ob.insert("Rahul");
     	ob.insert("sagar");
     	ob.insert("kituu ");
     	ob.insert("rishikumar");
     	ob.insert("abhinavu");
     	
		  ob.display();
		 
		
	}
}
