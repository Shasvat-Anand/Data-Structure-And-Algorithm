import java.util.*;
class Main{
    class Node {
        int data;
        Node next;
        Node (int data){
            this.data = data;
            
        }
    }
    Node head;
    public void push(int val){
        Node newnode = new Node( val);
        if(head==null){
            head = newnode;
            return ;
        }
        newnode.next = head;
        head = newnode;
    }
    
    public int pop(){
        if(isEmpty()){
            return -1;
        }
        int val = head.data;
        head = head.next;
        return val;
    }
    
    public int peek(){
        return head.data;
    }
    public boolean isEmpty(){
        return head==null;
    }
    public void display(){
        Node temp = head ; 
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp =temp.next;
        }
        System.out.println();
        
    }
    
    
    public static void main(String[] args){
        Main stack =  new Main();
        stack.push(8);
        stack.push(28);
        stack.push(800);
        stack.push(80);
        stack.display();
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        stack.display();
    }
}










