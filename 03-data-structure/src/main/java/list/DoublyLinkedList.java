package list;

public class DoublyLinkedList<T> {
    Node<T> head;
    Node<T> tail;
    public int length;

    public DoublyLinkedList() {
        this(null, null, 0);
    }

    private DoublyLinkedList(Node<T> head, Node<T> tail, int length) {
        this.head = head;
        this.tail = tail;
        this.length = length;
    }

    public DoublyLinkedList<T> push(T val) {
        Node<T> newNode = new Node<>(val);
        if (this.length == 0) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            this.tail.next = newNode;
            newNode.prev = this.tail;
            this.tail = newNode;
        }
        this.length++;
        return this;
    }

    public T pop() {
        if (this.length == 0) return null;

        Node<T> popped = this.tail;

        if (this.length == 1) {
            this.head = null;
            this.tail = null;
        } else {
            this.tail = popped.prev;
            this.tail.next = null;
            popped.prev = null;
        }

        this.length--;
        return popped.val;
    }

    public T shift() {
        if (this.length == 0) return null;

        Node<T> removed = this.head;

        if (this.length == 1) {
            this.head = null;
            this.tail = null;
        } else {
            this.head = removed.next;
            this.head.prev = null;
            removed.next = null;
        }

        this.length--;
        return removed.val;
    }

    public DoublyLinkedList<T> unshift(T val) {
        Node<T> newNode = new Node<>(val);

        if (this.length == 0) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            this.head.prev = newNode;
            newNode.next = this.head;
            this.head = newNode;
        }
        this.length++;
        return this;
    }







    class Node<T> {
        public T val;
        public Node<T> next;
        public Node<T> prev;

        public Node(T val) {
            this(val, null, null);
        }

        public Node(T val, Node<T> next, Node<T> prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
