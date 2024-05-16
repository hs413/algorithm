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

    public Node<T> getNode(int index) {
        if (index < 0 || index >= this.length) return null;

        int counter = 0;
        Node<T> current = this.head;
        while(counter != index) {
            current = current.next;
            counter++;
        }

        return current;
    }

    public T get(int index) {
        return this.getNode(index).val;
    }

    public boolean set(int index, T val) {
        Node<T> foundNode = this.getNode(index);

        if (foundNode != null) {
            foundNode.val = val;
            return true;
        }

        return false;
    }

    public boolean insert(int index, T val) {
        if (index < 0 || index > this.length) return false;

        if (index == 0) {
            this.unshift(val);
            return true;
        }

        if (index == this.length) {
            this.push(val);
            return true;
        }

        Node<T> newNode = new Node<T>(val);
        Node<T> prev = this.getNode(index - 1);
        Node<T> next = prev.next;

        prev.next = newNode;
        newNode.next = next;
        this.length++;

        return true;
    }

    public T remove(int index) {
        if (index < 0 || index >= this.length) return null;
        if (index == this.length - 1) return this.pop();
        if (index == 0) return this.shift();

        Node<T> previousNode = this.getNode(index - 1);
        Node<T> removed = previousNode.next;
        previousNode.next = removed.next;
        this.length--;
        return removed.val;
    }

    public SinglyLinkedList<T> reverse() {
        Node<T> node = this.head;
        this.head = this.tail;
        this.tail = node;

        Node<T> next;
        Node<T> prev = null;

        for (int i = 0; i < this.length; i++) {
            next = node.next;
            node.next = prev;
            prev = node;
            node = next;
        }
        return this;
    }
}