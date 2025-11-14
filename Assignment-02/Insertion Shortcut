    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        System.out.println("Printing Original LL: ");
        printLinkedList(head);
        System.out.println("\nPrinting front added LL: ");
        frontInsert(head,50);
        System.out.println("\nPrinting Last added LL: ");
        lastInsert(head,100);
        System.out.println("\nAdding in any position of LL: ");
        addInAny(head,200,3);
    }
    public static void frontInsert(Node head,int value){
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
        printLinkedList(head);
    }
    public static void lastInsert(Node head,int val){
        Node newNode = new Node(val);
        Node current = head;
        while(current.next!=null){
            current = current.next;
        }
        current.next = newNode;
        printLinkedList(head);
    }
    public static void addInAny(Node head,int value,int index){
        Node newNode = new Node(value);
        Node current = head;
        
        if(index==1){
            newNode.next = head;
            head = newNode;
            printLinkedList(head);
            return;
        }//Corner Case

        for(int i=1;i<index-1;i++){ //Index-1 because it will go to next node otherwise.
            current = current.next;
        }
        if(current==null){
            System.out.println("Index out of Bound");
            return;
        }//If the index is out of Bound
        newNode.next = current.next;
        current.next = newNode;
        printLinkedList(head);
    }
    public static void printLinkedList(Node head){
        Node current = head;
        while(current!=null){
            System.out.print(current.data+" ");
            current = current.next;
        }
    }
}
