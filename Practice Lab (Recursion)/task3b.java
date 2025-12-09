class Node {
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class task3b {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        task3B_recursive(head);
    }
    //Recursion Part
    static void task3B_recursive(Node current){
        if(current.next==null){
            return;
        }
        else{
            System.out.print(current.data+" ");
            task3B_recursive(current.next);
        }
    }
}
