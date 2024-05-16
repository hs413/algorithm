package linear;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DoublyLinkedListTest {
    DoublyLinkedList<Integer> list;

    @BeforeEach
    public void before() {
        this.list = new DoublyLinkedList<>();
    }

    @Test
    public void push() {
        list.push(1);
        list.push(2);
        assertThat(list.length).isEqualTo(2);
        list.push(3);
        assertThat(list.length).isEqualTo(3);
    }

    @Test
    public void pop() {
        assertThat(list.pop()).isNull();
        list.push(1);
        list.push(2);
        list.push(3);

        assertThat(list.pop()).isEqualTo(3);
        assertThat(list.length).isEqualTo(2);
    }

    @Test
    public void unshift() {
        list.unshift(1);
        list.unshift(2);
        assertThat(list.length).isEqualTo(2);
        list.unshift(3);
        assertThat(list.length).isEqualTo(3);
        assertThat(list.head.val).isEqualTo(3);
        assertThat(list.tail.val).isEqualTo(1);
    }

    @Test
    public void shift() {
        assertThat(list.shift()).isNull();
        list.push(1);
        list.push(2);
        list.push(3);

        assertThat(list.shift()).isEqualTo(1);
        assertThat(list.length).isEqualTo(2);
    }

    @Test
    public void get() {
        list.push(1);
        list.push(2);
        list.push(3);

        assertThat(list.get(-1)).isNull();
        assertThat(list.get(0)).isEqualTo(1);
        assertThat(list.get(1)).isEqualTo(2);
        assertThat(list.get(2)).isEqualTo(3);
        assertThat(list.get(3)).isNull();
    }

    @Test
    public void set() {
        list.push(1);
        list.push(2);
        list.push(3);

        assertThat(list.set(2, 123)).isTrue();
        assertThat(list.get(2)).isEqualTo(123);

        assertThat(list.set(8, 498)).isFalse();
        assertThat(list.set(-1, 498)).isFalse();
    }

    @Test
    public void insert() {
        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);

        assertThat(list.insert(2, 5)).isTrue();
        assertThat(list.length).isEqualTo(5);
        assertThat(list.get(3)).isEqualTo(3);

        assertThat(list.insert(5, 6)).isTrue();
        assertThat(list.get(5)).isEqualTo(6);
    }

    @Test
    public void remove() {
        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);
        list.push(5);

        assertThat(list.remove(-1)).isNull();
        assertThat(list.remove(5)).isNull();

        assertThat(list.remove(2)).isEqualTo(3);
        assertThat(list.getNode(1).next.val).isEqualTo(4);
        assertThat(list.getNode(2).prev.val).isEqualTo(2);
        assertThat(list.length).isEqualTo(4);
        assertThat(list.remove(0)).isEqualTo(1);

    }
}