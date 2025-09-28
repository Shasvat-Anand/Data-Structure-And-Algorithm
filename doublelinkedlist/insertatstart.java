import java.text.ListFormat.Style;
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

public class insertatstart {
    public static void main(String[] args) {

        Node  head= null;
        Node tail = null;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of element you want to make list");
        int n = sc.nextInt();

        System.out.println("enter the element:-");
        for(int i=0;i<n;i++){
            Node newNode = new Node(sc.nextInt());

            if(head == null){
                head = newNode;
                tail = newNode;
            }
            else{
                tail.next = newNode;
                newNode.prev = tail;
                tail= newNode;
            }
            
        }


       Node newhead = addatstart(head);



        Node temp = newhead;
        System.out.println("you linked list is :-----");
        while(temp!=null){
            System.out.print(temp.val +" ");
            temp = temp.next;
        }
    }


    public static Node addatstart(Node head){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num want to insert at start");
        int num = sc.nextInt();

        Node newnode = new Node(num);

        if(head !=null){

            head.prev = newnode;
            newnode.next =head;
        }

        head = newnode;

        return head;
    }
}
