package trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import static trees.BinarySearchTree.*;

public class TreeTraversal {
    public List<Integer> bfs(BinarySearchTree tree) {
        if (tree.root == null) return null;

        Queue<Node> queue = new LinkedList<>();
        List<Integer> visited = new ArrayList<>();
        queue.add(tree.root);

        while(!queue.isEmpty()) {
            Node node = queue.poll();
            visited.add(node.value);

//            if (node.value == val) return true;

            Node left = node.left;
            Node right = node.right;

            if (left != null) queue.add(left);
            if (right != null) queue.add(right);
        }

        return visited;
    }

    public List<Integer> dfsPreOrder(BinarySearchTree tree) {
        if (tree.root == null) return null;

        List<Integer> visited = new ArrayList<>();
        Node current = tree.root;
        traversePreOrder(current, visited);

        return visited;
    }

    private void traversePreOrder(Node node, List<Integer> visited) {
        visited.add(node.value);

        if (node.left != null) {
            traversePreOrder(node.left, visited);
        }

        if (node.right != null) {
            traversePreOrder(node.right, visited);
        }
    }

    public List<Integer> dfsPostOrder(BinarySearchTree tree) {
        if (tree.root == null) return null;

        List<Integer> visited = new ArrayList<>();
        Node current = tree.root;
        traversePostOrder(current, visited);

        return visited;
    }

    private void traversePostOrder(Node node, List<Integer> visited) {
        if (node.left != null) {
            traversePostOrder(node.left, visited);
        }

        if (node.right != null) {
            traversePostOrder(node.right, visited);
        }

        visited.add(node.value);
    }

    public List<Integer> dfsInOrder(BinarySearchTree tree) {
        if (tree.root == null) return null;

        List<Integer> visited = new ArrayList<>();
        Node current = tree.root;
        traverseInOrder(current, visited);

        return visited;
    }

    private void traverseInOrder(Node node, List<Integer> visited) {
        if (node.left != null) {
            traverseInOrder(node.left, visited);
        }

        visited.add(node.value);

        if (node.right != null) {
            traverseInOrder(node.right, visited);
        }
    }
}
