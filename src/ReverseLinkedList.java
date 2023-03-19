public class ReverseLinkedList {
    public static LinkedListNode<Integer> helperFunction(LinkedListNode<Integer> head){
        if(head == null || head.next == null)return head;

        LinkedListNode<Integer> reversedHead = helperFunction(head.next);
        // reversing the pointer
        LinkedListNode<Integer> pointerReverse = head.next;
        pointerReverse.next = head;
        // destroying the default pointer
        head.next = null;
        return reversedHead;
    }
    public static void main(String[] args) {
        int linkedListArr[] = {1,2,3,4};
        basicFunctions methods = new basicFunctions();
        LinkedListNode<Integer> head = methods.createLinkedList(linkedListArr);

        head = helperFunction(head);
        methods.printLinkedList(head);
    }
}
