class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class task3c {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        task3Csummation(head, 0);
    }

    static void task3Csummation(Node current, int sum) {
        while (current != null) {
            if (current.next == null) {
                sum+=current.data;
                System.out.println(sum);
                return;
            } 
            else {
                sum += current.data;
                current = current.next;
            }
        }
    }
}
