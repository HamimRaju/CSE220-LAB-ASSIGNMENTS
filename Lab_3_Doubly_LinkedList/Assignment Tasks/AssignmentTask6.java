public class AssignmentTask6 {

    public static void pairJoin(DNode dh1, DNode dh2) {

        DNode current1 =dh1.next;
        DNode current2= dh2.next;

        while (current1!=null && current2 != null) {

            DNode front1 =current1.next;
            DNode front2 =current2.next;

            current1.next=current2;
            current2.prev= current1;

            current2.next = front1;
            
            if (front1 != null) {
                front1.prev = current2;
            }
            current1 =front1;
            current2 =front2;        
        }
        
        DNode tail = dh1;
        while (tail.next != null) {
            tail = tail.next;
        }
        tail.next =dh1;
        dh1.prev =tail;
    }

    // DO NOT SUBMIT THE DRIVER CODE BELOW
    // SUBMITTING IT WILL INCREASE YOUR PLAG % FOR NO REASON
    public static void main(String[] args) {
        Object[] list1 = { "A", "B", "C", "D" };
        Object[] list2 = { "E", "F", "G", "H" };

        DNode dh1 = LinkedListHelpers.createDummyHeadedDoublyLL(list1, false);
        DNode dh2 = LinkedListHelpers.createDummyHeadedDoublyLL(list2, false);

        System.out.println("Given Linked List 1:");
        LinkedListHelpers.printDummyHeadedDoublyLL(dh1);

        System.out.println("Given Linked List 2:");
        LinkedListHelpers.printDummyHeadedDoublyLL(dh2);

        System.out.println("\nExpected Output:");
        Object[] expected = { "A", "E", "B", "F", "C", "G", "D", "H" };
        DNode expectedHead = LinkedListHelpers.createDummyHeadedDoublyLL(expected, true);
        LinkedListHelpers.printDummyHeadedDoublyCircularLL(expectedHead);

        // Running the Pair Join
        pairJoin(dh1, dh2);
        // Printing after Pair Join
        System.out.println("\nYour Output:");
        LinkedListHelpers.printDummyHeadedDoublyCircularLL(dh1);
    }
}
