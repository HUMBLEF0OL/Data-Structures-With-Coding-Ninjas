class Node{
    // creating node following LinkedList Structure
    int val;
    Node next;
    public Node(int val){
        this.val = val;
        this.next = null;
    }
}

public class Stack{
    private Node head;
    int size;
    public Stack(){
        head = null;
        size = 0;
    }
    public void push(int val){
        Node current = new Node(val);
        current.next = head;
        head = current;
        size++;
    }
    public int pop(){
        if(size == 0)return -1;
        int value = head.val;
        head = head.next;
        size--;
        return value;
    }
    public int getSize(){
        return size;
    }


}