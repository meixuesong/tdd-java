package com.coding;

import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class SampleTest {
    @Test
    public void name() {
        assertTrue(true);
    }

    @Test
    public void assertj_should_works() {
        String a = "a";
        assertThat(a).isEqualToIgnoringCase("A");
    }

    @Test
    public void mockito_should_works() {
        List mockedList = mock(List.class);

        mockedList.add("one");
        mockedList.clear();

        verify(mockedList).add("one");
        verify(mockedList).clear();
    }
}
