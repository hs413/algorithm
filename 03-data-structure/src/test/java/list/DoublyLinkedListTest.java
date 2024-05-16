package list;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

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
}