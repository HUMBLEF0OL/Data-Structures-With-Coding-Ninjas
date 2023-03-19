
public class deleteNodeThroughRecursion {
    /*
     * OBJECTIVE: delete a node present at ith index using recursion
     * NOTE that the linkedList is zero indexed
     */
    private static LinkedListNode<Integer> helperFunction(LinkedListNode<Integer> head, int index){
        if(index < 0 || head == null)return null;
        if(index == 0) return head.next;
        head.next = helperFunction(head.next, --index);
        return head;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        basicFunctions methods = new basicFunctions();
        LinkedListNode<Integer> head = methods.createLinkedList(arr);;
        int index = 50;
        head = helperFunction(head, index);
        methods.printLinkedList(head);
        System.out.println("\n"+"LinkedList Length "+methods.linkedListLength(head));
    }
}
