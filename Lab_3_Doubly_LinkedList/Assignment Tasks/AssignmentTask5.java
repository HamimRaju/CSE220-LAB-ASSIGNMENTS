public class AssignmentTask5 {

    public static void sumOddAppend(Node dh) {
        Node current = dh.next;
        int summation = 0;
        while (current != dh) {
            if((int)current.next.elem %2 == 1){
                dh.next = current.next;
                summation += (int)current.next.elem;
            }
            current = current.next;
        }
        Node newNode = new Node(summation); 
        Node temp = dh;
        while (temp.next != null) {
            temp.next = newNode;
        }
        temp = temp.next;
        newNode.next = dh;
    }

    public static void main(String[] args) {
        Object[] values = { 11, 22, 33, 44, 55, 66 };
        Node head = LinkedListHelpers.createDummyHeadedSinglyCircularLL(values, true);

        System.out.println("Given Linked List:");
        LinkedListHelpers.printDummyHeadedSinglyCircularLL(head);
        System.out.println("\nExpected Output:");
        Object[] expected = { 22, 44, 66, 99 };
        Node expectedHead = LinkedListHelpers.createDummyHeadedSinglyCircularLL(expected, true);
        LinkedListHelpers.printDummyHeadedSinglyCircularLL(expectedHead);

        // Running the Sum Odd Append
        sumOddAppend(head);
        // Printing after Sum Odd Append
        System.out.println("\nYour Output:");
        LinkedListHelpers.printDummyHeadedSinglyCircularLL(head);
    }
}
