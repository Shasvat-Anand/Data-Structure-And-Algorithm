import java.util.*;
class Main{
    class Node {
        int data;
        Node next;
        Node (int val){
            this.data = val;
            this.next = null;
        }
    }
    Node head; 
    Node tail;
    public void append(int val){
        Node newnode = new Node(val);
        if(head == null){
            head  = newnode;
            tail = newnode;
            newnode.next = head;
            
        }else{
        newnode.next = head;
        tail.next = newnode;
        tail = newnode;
        }
    }
    
    public void insertatend(int val){
        Node newnode = new Node (val);
        if(head == tail){
            head  = newnode;
            tail = newnode;
            newnode.next = head;
        }
        tail.next = newnode;
        newnode.next = head;
        tail = newnode;
    }
    
    
    public void insertatfirst(int val){
        Node newnode = new Node(val);
        if(head==null){
            head = newnode;
            tail = newnode;
            newnode.next = head;
            
        }
        
        newnode.next = head;
        head = newnode;
        tail.next = head;
    }
    
    
    public void insertatpos(int val , int ind){
        if(ind<=0){
            System.out.println("invalid");
            return;
        }
        Node temp = head;
        int count =1;
        while(temp!=null && count <ind-1){
            temp = temp.next;
            count++;
        }
        Node newnode = new Node(val);
        newnode.next = temp.next;
        temp.next = newnode;
    }
    
    public int remove(){
        if(tail == head){
            int val = tail.data;
            head = null;
            tail = null;
            return val;
        }
        Node temp = head;
        while(temp.next!= tail){
 
            temp = temp.next;
        }
        int val = tail.data;
        tail = temp;
        tail.next = head;
        
        return val;
    }
    
    public int removeatfirst(){
        if(head == tail){
            int val = head.data;
            head = null;
            tail =null;
            return val;
        }
        int val = head.data;
        head = head.next ; 
        tail.next = head;
        return val;
    }
    
    public int removeatpos(int ind){
        if(ind<=0){
            return -1;
        }
        Node temp = head;
        int count = 1;
        while(temp!=null && count < ind-1){
            temp = temp.next;
            count++;
        }
        int val = temp.next.data;
        temp.next = temp.next.next;
        return val;
        
    }
    
    public void display(){
        Node temp = head;
        do{
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        while(temp!=head);
           
        System.out.println();
    }
    
    public static void main(String[] args){
        Main cl = new Main();
        cl.append(7);
        cl.append(730);
        cl.append(702);
       
        cl.append(590);
        cl.insertatfirst(50);
        cl.insertatpos(50, 3);
        cl.insertatend(5);
        cl.display();
        System.out.println(cl.remove());
        System.out.println( cl.removeatfirst());
        System.out.println( cl.removeatpos(2));
        cl.display();
    }
    
    

}















