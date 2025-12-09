class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class task3d {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next= new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        task3C_recursive(head,0);
    }
    static void task3C_recursive(Node current,int sum){
        if(current==null){
            System.out.println(sum);
            return;
        }
        task3C_recursive(current.next,sum+=current.data);
    }
} 