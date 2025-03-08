package ru.job4j.stream;

import org.junit.Test;
import java.util.List;
import static org.junit.Assert.*;

public class SimplePipelineTest {

    @Test
    public void whenNotPipes() {
        assertEquals(SimplePipeline.of(1).collect(), List.of(1));
    }

    @Test
    public void whenFilter() {
        assertEquals(SimplePipeline.of(1, 10)
                .filter(el -> el > 1).collect(), List.of(10));
    }

    @Test
    public void whenMap() {
        assertEquals(SimplePipeline.of(1, 10)
                .map(el -> el * el).collect(), List.of(1, 100));
    }

    @Test
    public void whenFilterMap() {
        assertEquals(SimplePipeline.of(1, 10)
                .filter(el -> el > 1).map(el -> el * el).collect(), List.of(100));
    }

    @Test
    public void whenMapFilter() {
        assertEquals(SimplePipeline.of(1, 10)
                .map(el -> el * el)
                .filter(el -> el < 10).collect(), List.of(1));
    }

    @Test
    public void whenFilterMapFilter() {
        assertEquals(SimplePipeline.of(1, 2, 3, 4)
                .filter(el -> el > 2)
                .map(el -> el * el)
                .filter(el -> el < 10).collect(), List.of(9));
    }
}