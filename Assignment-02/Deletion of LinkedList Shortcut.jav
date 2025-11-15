public class deletion {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        System.out.println("Printing Original LL: ");
        printLinkedList(head);
        System.out.println("\nRemoving first element of LL: ");
        removeFirst(head);
        System.out.println("\nRemoving last element of LL: ");
        removeLast(head);
        System.out.println("\nRemoving any element of LL: ");
        removeAnyIndex(head,3);

    }
    public static void removeFirst(Node head){
        head = head.next;
        printLinkedList(head);
    }
    public static void removeLast(Node head){
        Node current = head;
        while (current.next.next!=null) {
            current = current.next;
        }
        current.next = null;
        printLinkedList(head);
    }
    public static void removeAnyIndex(Node head,int index){
        Node current = head;
        if(index==1){
            head = head.next;
            printLinkedList(head);
            return;
        }
        for(int i=1;i<index-1;i++){
            current = current.next;
        }
        current.next = current.next.next;
        printLinkedList(head);
    }
    public static void printLinkedList(Node head){
        Node current = head;
        while (current!=null) {
            System.out.print(current.data+" ");
            current = current.next;
        }
    }
}
