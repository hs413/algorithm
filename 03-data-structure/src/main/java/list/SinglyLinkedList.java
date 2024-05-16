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

    public SinglyLinkedList<T> push(T val) {
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

//    public void traverse() {
//        Node<T> current = this.head;
//        while(current != null) {
//            System.out.println(current.val);
//            current = current.next;
//        }
//    }

    public T pop() {
        if (this.head == null) return null;

        Node<T> current = this.head;
        Node<T> newTail = current;

        while (current.next != null) {
            newTail = current;
            current = current.next;
        }

        this.tail = newTail;
        this.tail.next = null;
        this.length--;

        if (this.length == 0) {
            this.head = null;
            this.tail = null;
        }

        return current.val;
    }

    public T shift() {
        if (this.head == null) return null;

        Node<T> currentHead = this.head;
        this.head = currentHead.next;
        this.length--;

        if (this.length == 0) {
            this.tail = null;
        }
        return currentHead.val;
    }

    public SinglyLinkedList<T> unshift(T val) {
        Node<T> newNode = new Node<T>(val);

        if (this.head == null) {
            this.head = newNode;
            this.tail = this.head;
        } else {
            newNode.next = this.head;
            this.head = newNode;
        }
        this.length++;
        return this;
    }
}