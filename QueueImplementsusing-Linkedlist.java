import java.util.*;
class Main{
    class Node{
        int data;
        Node next ;
        Node (int data){
            this.data = data;
        }
    }
    Node head; 
    Node tail;
    public void enqueue(int val){
        Node newnode = new Node(val);
        if(head == null){
            head =tail = newnode;
            return ;
        }
        tail.next = newnode;
        tail = newnode;
    }
    public boolean isEmpty(){
        return head ==null;
    }
    
    public int dequeue(){
        if(isEmpty()){
            return -1;
        }
        if(head == tail){
            int val = tail.data;
            head = tail =null;
            return val;
        }
        int val = head.data;
        head = head.next;
        return val;
    }
    
    public void insertatfront(int val){
        Node newnode = new Node(val);
        if(head == null){
            head = tail = null;
            return ;
        }
        newnode.next = head;
        head = newnode;
    }
    
    public void insertatback(int val){
        Node newnode = new Node(val);
        if(head == null){
            head =tail = null;
            return ;
        }
        tail.next = newnode;
        tail = newnode;
    }
    
    public int front(){
        if(isEmpty()) return -1;
        return head.data;
    }
    
    
    public void display(){
        Node temp =head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[]args){
        Main queue = new Main();
        queue.enqueue(4);
        queue.enqueue(432);
        queue.enqueue(43);
        queue.enqueue(6);
        queue.display();
        System.out.println(queue.dequeue());
        queue.insertatback(87);
        queue.display();
        queue.insertatfront(59);
        queue.display();
        System.out.println(queue.front());
        queue.display();
    }
}





