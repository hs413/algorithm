package trees;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


class TreeTraversalTest {
    BinarySearchTree tree;
    TreeTraversal traversal;

    @BeforeEach
    public void before() {
        this.tree = new BinarySearchTree();
        this.traversal = new TreeTraversal();
        tree.insert(10);
        tree.insert(6);
        tree.insert(3);
        tree.insert(8);
        tree.insert(15);
        tree.insert(20);
    }

    @Test
    public void bfs() {
        List<Integer> list = this.traversal.bfs(tree);
        assertThat(list).containsSequence(10, 6, 15, 3, 8, 20);
    }

}