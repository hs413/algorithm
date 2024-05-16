package list;

public class SinglyLinkedList<T> {
    Node<T> head;
    Node<T> tail;
    int length;

    public SinglyLinkedList() {
        this(null, null, 0);
    }

    public SinglyLinkedList(Node<T> head, Node<T> tail, int length) {
        this.head = head;
        this.tail = tail;
        this.length = length;
    }

    public SinglyLinkedList<T> push(T val){
        Node<T> newNode = new Node<T>(val);
        if (this.head == null) {
            this.head = newNode;
            this.tail = this.head;
        } else {
            this.tail.next = newNode;
            this.tail = newNode;
        }
        this.length++;
        return this;
    }
}
