import java.util.Scanner;

class Node {
    int val;
    Node prev;
    Node next;
    
    Node(int val){
        this.val = val;
        prev = null;
        next = null;
    }
}

public class insertatend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of element you wanna to enter");
        int n = sc.nextInt();

        Node head = null;
        Node tail = null;

        System.out.println("Enter the element of list :--");

        for(int i=0;i<n;i++){
            Node newNode = new Node(sc.nextInt()) ;
            if(head == null){
                head = newNode;
                tail = newNode;
            }
            else{
                 tail.next = newNode;
                 newNode.prev = tail;
                 tail = newNode;
            }

           
        }

        addatend(head);


        System.out.println("your linked list is :----");
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val +" ");
           
            temp = temp.next;
        }
    }


    public static void addatend(Node head){
        Node temp = head;

        while(temp.next!= null){
            temp=temp.next;

        }
        System.out.println("enter a number you want to insert at end of the list");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Node newnode = new Node(num);
        
        temp.next = newnode;
        newnode.prev = temp;
        
    }
}
