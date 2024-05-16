package list;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

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
}