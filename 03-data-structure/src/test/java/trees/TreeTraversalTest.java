package trees;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
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
    @DisplayName("너비 우선 탐색")
    public void bfs() {
        /**
         *       10
         *    6      15
         *  3   8       20
         * */
        List<Integer> list = this.traversal.bfs(tree);
        assertThat(list).containsSequence(10, 6, 15, 3, 8, 20);
    }

    @Test
    @DisplayName("깊이 우선 탐색 - 전위")
    public void dfsPreOrder() {
        /**
         *       10
         *    6      15
         *  3   8       20
         * */
        List<Integer> list = this.traversal.dfsPreOrder(tree);
        assertThat(list).containsSequence(10, 6, 3, 8, 15, 20);
    }

    @Test
    @DisplayName("깊이 우선 탐색 - 후위")
    public void dfsPostOrder() {
        /**
         *       10
         *    6      15
         *  3   8       20
         * */
        List<Integer> list = this.traversal.dfsPostOrder(tree);
        assertThat(list).containsSequence(3, 8, 6, 20, 15, 10);
    }

    @Test
    @DisplayName("깊이 우선 탐색 - 중위")
    public void dfsInOrder() {
        /**
         *       10
         *    6      15
         *  3   8       20
         * */
        List<Integer> list = this.traversal.dfsInOrder(tree);
        assertThat(list).containsSequence(3, 6, 8, 10, 15, 20);
    }
}