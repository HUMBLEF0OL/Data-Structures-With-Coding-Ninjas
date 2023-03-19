public class basicFunctions {
    /* create linkedList out of array */
    public LinkedListNode<Integer> createLinkedList(int arr[]){
        if(arr.length == 0)return null;
        LinkedListNode<Integer> head = null;
        LinkedListNode<Integer> tail = null;
        for (int i = 0; i < arr.length; i++) {
            LinkedListNode<Integer> current = new LinkedListNode<Integer>(arr[i]);
            if(head == null){
                head = current;
                tail = head;
            } else{
                tail.next = current;
                tail = tail.next;
            }
        }
        return head;
    }

    /* print the linkedList */
    public void printLinkedList(LinkedListNode<Integer> head){
        if(head == null){
            return;
        }
        System.out.print(head.data+" ");
        printLinkedList(head.next);
    }

    /* length of linkedList */
    public int linkedListLength(LinkedListNode<Integer> head){
        if(head == null)return 0;
        int result = linkedListLength(head.next);
        return ++result;
    }
    
}
