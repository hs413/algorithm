package trees;

public class BinarySearchTree {
    Node root;

    public BinarySearchTree() {
        this.root = null;
    }

    public BinarySearchTree insert(Integer val) {
        Node newNode = new Node(val);

        if (this.root == null) {
            this.root = newNode;
            return this;
        }

        Node current = this.root;

        while(true) {
            if (val > current.value) {
                if (current.right == null) {
                    current.right = newNode;
                    return this;
                }
                current = current.right;
                continue;
            }

            if (val < current.value) {
                if (current.left == null) {
                    current.left = newNode;
                    return this;
                }
                current = current.left;
                continue;
            }
            break;
        }

        return this;
    }

    public Node findNode(Integer val) {
        Node current = this.root;

        while(true) {
            if (current == null) return null;

            if (val == current.value) return current;

            if (val > current.value) {
                current = current.right;
            } else {
                current = current.left;
            }
        }
    }

    public boolean find(Integer val) {
        Node find = findNode(val);
        if (find == null) return false;

        return true;
    }

    static class Node {
        Integer value;
        Node left;
        Node right;

        public Node(Integer value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }
}
