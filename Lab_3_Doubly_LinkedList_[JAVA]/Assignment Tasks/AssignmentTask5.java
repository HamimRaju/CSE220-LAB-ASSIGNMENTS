public class AssignmentTask5 {

    public static void sumOddAppend(Node dh) {

        Node prev = dh;
        Node current = dh.next;
        int sum = 0;

        while (current!=dh) {
            int val = (Integer) current.elem;
            if (val % 2!= 0) {
                sum+= val;
                prev.next = current.next;
                current = prev.next;
            } 
            else{
                prev =current;
                current =current.next;
            }
        }
        Node tail = dh;
        while (tail.next != dh) {
            tail = tail.next;
        }
        Node newNode = new Node(sum);
        newNode.next = dh;
        tail.next = newNode;
    }

    // DO NOT SUBMIT THE DRIVER CODE BELOW
    // SUBMITTING IT WILL INCREASE YOUR PLAG % FOR NO REASON
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
