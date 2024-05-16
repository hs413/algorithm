package list;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SinglyLinkedListTest {
    @Test
    public void test() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();

        list.push(1);
        list.push(33);

        assertThat(list.length).isEqualTo(2);
        assertThat(list.head.val).isEqualTo(1);
        assertThat(list.head.next.val).isEqualTo(33);
        assertThat(list.tail.val).isEqualTo(33);

    }
}