public class midPointOfLinkedList {
    public static LinkedListNode<Integer> helperFunction(LinkedListNode<Integer> head){
        // using fast and slow pointer technique
        if(head == null || head.next == null) return head;
        LinkedListNode<Integer> fast = head.next;
        LinkedListNode<Integer> slow = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static void main(String args[]){
        int linkedListArr[] = {1};
        basicFunctions method = new basicFunctions();
        LinkedListNode<Integer> head = new LinkedListNode<Integer>(null);
        head = method.createLinkedList(linkedListArr);
        System.out.println(helperFunction(head));


    }
}
