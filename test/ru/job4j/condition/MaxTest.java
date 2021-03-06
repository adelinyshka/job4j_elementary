package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax88To27Then88() {
        int result = Max.max(88, 27);
        assertThat(result, is(88));
    }

    @Test
    public void whenMax4To7Then7() {
        int result = Max.max(4, 7);
        assertThat(result, is(7));
    }

    @Test
    public void whenMax8To8Then8() {
        int result = Max.max(8, 8);
        assertThat(result, is(8));
    }

    @Test
    public void whenMax957Then9() {
        int result = Max.maxFor3(9, 5, 7);
        System.out.println(result);
        assertThat(result, is(9));
    }

    @Test
    public void whenMax1234Then8() {
        int result = Max.maxFor4(1, 2, 3, 4);
        System.out.println(result);
        assertThat(result, is(4));
    }
}
