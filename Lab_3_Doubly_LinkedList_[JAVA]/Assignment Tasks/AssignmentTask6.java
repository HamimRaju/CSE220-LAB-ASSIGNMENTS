public class AssignmentTask6 {

    public static void pairJoin(DNode dh1, DNode dh2) {

        DNode pair1 =dh1.next;
        DNode pair2= dh2.next;

        while (pair1!=null && pair2 != null) {

            DNode next1 =pair1.next;
            DNode next2 =pair2.next;

            pair1.next=pair2;
            pair2.prev= pair1;
            pair2.next = next1;
            if (next1 != null) {
                next1.prev = pair2;
            }
            pair1 =next1;
            pair2 =next2;
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
