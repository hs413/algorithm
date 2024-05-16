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

    public Node<T> getNode(int index) {
        if (index < 0 || index >= this.length) return null;
        int counter;
        Node<T> current;
        if (index < this.length / 2) {
            System.out.println("FROM START");
            current = this.head;
            counter = 0;
            while(counter != index) {
                current = current.next;
                counter++;
            }
        } else {
            System.out.println("FROM END");
            counter = this.length - 1;
            current = this.tail;

            while(counter != index) {
                current = current.prev;
                counter--;
            }
        }

        return current;
    }

    public T get(int index) {
        Node<T> node = this.getNode(index);
        if (node == null) return null;
        return node.val;
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
        newNode.prev = prev;
        next.prev = newNode;
        this.length++;

        return true;
    }

    public T remove(int index) {
        if (index < 0 || index >= this.length) return null;
        if (index == this.length - 1) return this.pop();
        if (index == 0) return this.shift();

        Node<T> removed = this.getNode(index);
        removed.prev.next = removed.next;
        removed.next.prev = removed.prev;

        removed.next = null;
        removed.prev = null;

        this.length--;
        return removed.val;
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
