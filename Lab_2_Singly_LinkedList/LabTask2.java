public class LabTask2 {

    public static Node wordDecoder( Node head ){
        int count = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            count++;
        }
        int modulo = 13 % count;
        
        int index = 0;
        Node prev = null;
        Node current = head;
        while(current != null){
            if(index != 0 && index % modulo == 0){
                Node newNode = new Node(current.elem); //Creating new Node with current value
                newNode.next = prev;
                prev = newNode;
            }
            index++;
            current = current.next;
        }
        Node dummyHead = new Node(null);
        dummyHead.next = prev;
        return dummyHead;
    }

    public static void main(String[] args){
        System.out.println("==============Test Case 1=============");
        Node head = LinkedList.createList(new Character[]{'B', 'M', 'D', 'T', 'N', 'O', 'A', 'P', 'S', 'C'});
        System.out.print("Encoded Word: ");
        LinkedList.printLL(head);
        System.out.println("\nExpected output: null -> C -> A -> T");
        Node result = wordDecoder(head);
        System.out.println( "Your output: ");
        LinkedList.printLL(result); //This should print null -> C -> A -> T
        System.out.println();
        System.out.println("==============Test Case 2=============");
        head = LinkedList.createList(new Character[]{'Z', 'O', 'T', 'N', 'X'});
        System.out.print("Encoded Word: ");
        LinkedList.printLL(head);
        System.out.println("\nExpected output: null -> N");
        result = wordDecoder(head);
        System.out.println( "Your output: ");
        LinkedList.printLL(result); //This should print null -> N
        System.out.println();
    }
}
