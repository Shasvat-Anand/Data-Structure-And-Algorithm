 

class Main {
     class Node {
         int data;
         Node prev;
         Node next;
         Node(int data){
             this.data= data;
             this.prev= null;
             this.next= null;
         }
     }
     Node head;
     Node tail;
     public void append(int val){
         Node newnode = new Node(val);
         if(head==null){
            head= tail=newnode;
            return;
         }
         tail.next= newnode;
         newnode.prev= tail;
         tail = newnode;
         
         
     }
     
     public void insertatfirst(int num){
         Node newnode = new Node(num);
         if(head==null){
             head =tail= newnode ;
             return;
         }
         head.prev = newnode;
         newnode.next = head;
         head = newnode;
     }
     
     public void insertatend(int num){
         Node newnode = new Node(num);
         if(head == null){
             head = tail = newnode;
             return;
         }
         tail.next = newnode;
         newnode.prev= tail;
         tail = newnode;
        
     }
     
     public void insertatpos(int num , int ind){
         if(ind<=0){
             System.out.println("invalid position");
             return;
         }
         Node newnode = new Node(num);
         int count =1;
         Node temp = head;
         
         while(temp!=null && count<ind-1){
             temp = temp.next;
             count++;
         } 
        newnode.next= temp.next;
        newnode.prev= temp;
        temp.next.prev = newnode;
        temp.next = newnode;
     }
     
     public int remove(){
         if(tail == head){
             int val = head.data;
             head = null;
             tail = null;
             return val;
             
         }
         int val = tail.data;
         
         tail = tail.prev;
         tail.next = null;
         
         return val;
     }
     
     public int removeatfirst(){
         if(head == tail){
             int val = head.data;
             head = null;
             tail = null;
             return val;
         }
         int val = head.data;
         head = head.next;
         head.prev = null;
         return val;
     }
     
     
     public int removeatpos(int ind){
         if(ind<=0){
             System.out.println("invalid position");
             return -1;
         }
         Node temp = head;
         int count =1;
         while(temp!=null && count<ind-1){
             temp = temp.next;
             count++;
            
         }
         int val = temp.next.data;
         temp.next = temp.next.next;
         temp.next.next.prev = temp;
         return val;
         
     }
     
     public void display(){
         Node temp = head;
         while(temp!=null){
             System.out.print(temp.data + " ");
             temp  = temp.next;
         }
         System.out.println();
     }
     
     public static void main(String[] args){
         Main dd = new Main();
         dd.append(7);
         dd.append(8);
         dd.append(6);
         dd.append(0);
         dd.append(90);
         dd.insertatfirst(6);
         dd.insertatend(60);
         dd.insertatpos(600, 3);
         dd.display();
         dd.remove();
         dd.display();
         dd.removeatfirst();
         dd.display();
         dd.removeatpos(2);
         dd.display();
         
     }
}



















