public class deleteEveryMnodesAfterNnodes {
    public static LinkedListNode<Integer> deleteHelper(LinkedListNode<Integer> head, int m, int n) {
        // when we don't delete any node
        if (n == 0)
            return head;
        // when we delete every node
        if (m == 0)
            return null;
        // defining all the required variables
        LinkedListNode<Integer> temp = head, current = head;
        while (current != null) {
            for (int i = 1; i < m && temp != null; i++) {
                current = current.next;
            }
            if (current == null)
                return head;
            temp = current.next;
            for (int i = 1; i <= n && temp != null; i++) {
                temp = temp.next;
            }
            if (temp == null) {
                current.next = null;
                return head;
            }
            current.next = temp;
            current = temp;
        }
        return head;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        basicFunctions method = new basicFunctions();
        LinkedListNode<Integer> head = method.createLinkedList(arr);
        head = deleteHelper(head, 2, 2);
        method.printLinkedList(head);
    }
}
