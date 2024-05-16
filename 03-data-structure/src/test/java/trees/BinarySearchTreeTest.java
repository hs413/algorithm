package trees;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BinarySearchTreeTest {
    BinarySearchTree tree;

    @BeforeEach
    public void before() {
        this.tree = new BinarySearchTree();
    }

    @Test
    public void insertAndFind() {
        tree.insert(10);
        tree.insert(5);
        tree.insert(13);
        tree.insert(11);
        tree.insert(2);
        tree.insert(16);
        tree.insert(7);

        /**
         *       10
         *    5      13
         *  2   7   11  16
         * */
        assertThat(tree.find(10)).isTrue();
        assertThat(tree.find(5)).isTrue();
        assertThat(tree.find(2)).isTrue();
        assertThat(tree.find(7)).isTrue();
        assertThat(tree.find(13)).isTrue();
        assertThat(tree.find(16)).isTrue();
        assertThat(tree.find(11)).isTrue();
        assertThat(tree.find(1)).isFalse();
        assertThat(tree.find(100)).isFalse();
    }
}