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
}
