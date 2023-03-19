public class mergeSortLinkedList {
    /* merging 2 sorted linkedlist */
    public static LinkedListNode<Integer> mergeNode(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2) {
        if (head1 == null && head2 == null)
            return null;
        if (head1 == null)
            return head2;
        if (head2 == null)
            return head1;
        LinkedListNode<Integer> head = null;
        LinkedListNode<Integer> tail = null;
        while (head1 != null && head2 != null) {
            LinkedListNode<Integer> current = new LinkedListNode<Integer>(null);
            if (head1.data < head2.data) {
                current = head1;
                head1 = head1.next;
            } else {
                current = head2;
                head2 = head2.next;
            }
            if (head == null) {
                head = current;
                tail = head;
            } else {
                tail.next = current;
                tail = current;
            }
        }
        if (head1 != null) {
            tail.next = head1;
        } else {
            tail.next = head2;
        }
        return head;
    }

    public static LinkedListNode<Integer> mergeSort(LinkedListNode<Integer> head) {
        if (head == null || head.next == null) return head;
        /* calling midPointOfLinkedList class */
        LinkedListNode<Integer> mid = midPointOfLinkedList.helperFunction(head);
        LinkedListNode<Integer> head2 = mid.next;
        mid.next =null;
        return mergeNode(mergeSort(head), mergeSort(head2));
    }

    public static void main(String args[]) {
        int ll1[] = { 8,4,3,1,7};

        basicFunctions method = new basicFunctions();
        LinkedListNode<Integer> head = method.createLinkedList(ll1);
        LinkedListNode<Integer> output = mergeSort(head);
        method.printLinkedList(output);

    }
}
