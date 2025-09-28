class Node {
    Node next;
    Node prev;
    int data;

    Node(int data){
        this.data = data;
        next= null;
        prev = null;
    }

}


public class creating {
    public static void main(String[] args){
        
        Node head = new Node(3);
        
        head.next = new Node (5);
        head.next.prev = head;


        head.next.next = new Node(6);
        head.next.next.prev = head.next;

        Node temp = head;

        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }

    }
}
