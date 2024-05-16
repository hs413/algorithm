package linear;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SinglyLinkedListTest {
    SinglyLinkedList<Integer> list;

    @BeforeEach
    public void before() {
        this.list = new SinglyLinkedList<>();

    }

    @Test
    public void pushTest() {
        list.push(1);
        list.push(33);

        assertThat(list.length).isEqualTo(2);
        assertThat(list.head.val).isEqualTo(1);
        assertThat(list.head.next.val).isEqualTo(33);
        assertThat(list.tail.val).isEqualTo(33);

    }
//    @Test
//    public void traverseTest() {
//        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
//        list.push(1);
//        list.push(33);
//        list.traverse();
//    }

    @Test
    public void popTest() {
        assertThat(list.pop()).isNull();

        list.push(1);
        list.push(33);

        assertThat(list.pop()).isEqualTo(33);
        assertThat(list.length).isEqualTo(1);
        assertThat(list.pop()).isEqualTo(1);
        assertThat(list.pop()).isNull();
    }

    @Test
    public void shiftTest() {
        assertThat(list.shift()).isNull();

        list.push(1);
        list.push(33);

        assertThat(list.shift()).isEqualTo(1);
        assertThat(list.length).isEqualTo(1);
        assertThat(list.shift()).isEqualTo(33);
        assertThat(list.shift()).isNull();
    }

    @Test
    public void unshiftTest() {
        list.unshift(1);
        list.unshift(33);

        assertThat(list.length).isEqualTo(2);
        assertThat(list.head.val).isEqualTo(33);
        assertThat(list.head.next.val).isEqualTo(1);
        assertThat(list.tail.val).isEqualTo(1);
    }

    @Test
    public void get() {
        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);
        list.push(5);
        list.push(6);
        list.push(33);

        assertThat(list.get(0)).isEqualTo(1);
        assertThat(list.get(6)).isEqualTo(33);
        assertThat(list.get(10)).isNull();
    }

    @Test
    public void set() {
        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);
        list.push(5);
        list.push(6);
        list.push(33);

        assertThat(list.set(6, 123)).isTrue();
        assertThat(list.get(6)).isEqualTo(123);

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
        assertThat(list.length).isEqualTo(4);
        assertThat(list.remove(0)).isEqualTo(1);

    }

    @Test
    public void reverse() {
        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);
        list.push(5);
        list.reverse();
        assertThat(list.get(0)).isEqualTo(5);
    }
}