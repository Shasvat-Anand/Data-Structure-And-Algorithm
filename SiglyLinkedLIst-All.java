 
import java.util.*;
 
class Main{
    public class Node{
         int data;
         Node next;
         Node(int data){
             this.data= data;
             this.next= null;
         }
     }
     Node head;
     public void append(int val){
         Node newnode = new Node(val);
         if(head==null){
             head= newnode;
             return;
         }
         Node temp = head;
         while(temp.next!=null){
             temp=temp.next;
         }
         temp.next = newnode;
     }
     
     public  void insertatend(int val){
         Node newnode = new Node(val);
         if(head== null){
             head = newnode;
         }
         Node temp = head;
         while(temp.next!=null){
             temp=temp.next;
         }
         temp.next = newnode;
     }
     
     public  void insertathead(int val){
         Node newnode = new Node (val);
         if(head==null){
             head = newnode;
             
         }
         newnode.next = head;
         head = newnode;
     }
     
     public  void insertatposition(int val, int pos){
         Node newnode = new Node (val);
         Node temp = head;
         int curr=1;
         while(temp!=null && curr<pos-1){
             temp = temp.next;
             curr++;
         }
         newnode.next = temp.next;
         temp.next = newnode;
     }
     
     public  int remove(){
         Node temp = head;
         while(temp.next.next!=null){
             temp = temp.next;
         }
         
         int val =temp.next.data;
         temp.next = null;
         return val;
     }
     public int removeatfirst(){
         int val = head.data;
         head = head.next;
         return val;
         
     }
     public int removeatposition(int ind){
         int cout = 1;
         Node temp = head;
         
         while(temp!=null && cout<ind-1){
             temp= temp.next;
             cout++;
         }
         int val = temp.next.data;
         temp.next = temp.next.next;
         return val;
     }
    
     
     public void display(){
         Node temp  = head;
         while(temp!=null){
             System.out.print(temp.data+" ");
             temp = temp.next;
         }
         System.out.println();
     }

     
     public static void main(String[] args){
         Main sll = new Main();
         
         sll.append(7);
         sll.append(70);
         sll.append(78);
         sll.append(79);
         sll.insertatend(790);
         sll.insertathead(790);
         sll.display();
         sll.insertatposition(55, 3);
         sll.display();
         System.out.println(sll.removeatposition(2));
         sll.display();
         System.out.println(sll.remove());
         System.out.println(sll.removeatfirst());
         sll.display();
     }
     
     
}





 



