
public class separateEvenOdd {
    public static LinkedListNode<Integer> separatorFunction(LinkedListNode<Integer> head){
        LinkedListNode<Integer> oddHead = null,evenHead = null;
        LinkedListNode<Integer> oddTail = null, evenTail = null;
        while(head!=null){
            LinkedListNode<Integer> current = new LinkedListNode<Integer>(head.data);
            if(current.data %2 ==0){
                if(evenHead == null){
                    evenHead = current;
                    evenTail = evenHead;
                } else{
                    evenTail.next = current;
                    evenTail = current;
                }
            } else {
                if(oddHead == null){
                    oddHead = current;
                    oddTail = oddHead;
                } else{
                    oddTail.next = current;
                    oddTail = current;
                }
            }
            head = head.next;
        }
        if(oddHead != null){
            oddTail.next = evenHead;
            return oddHead;
        }
        return evenHead;
    }
    public static void main(String args[]){
        int arr[] = {1,4,5,2,7,6};
        basicFunctions method = new basicFunctions();
        LinkedListNode<Integer> head= method.createLinkedList(arr);
        head = separatorFunction(head);
        method.printLinkedList(head);
    }
}
