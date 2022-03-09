package fr.lernejo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SampleTest {

    @Test
    void op() {
        Sample sample_t = new Sample();
        assertEquals(sample_t.op(Sample.Operation.ADD, 1, 2), 3);
        assertEquals(sample_t.op(Sample.Operation.ADD, 6, 2), 8);
        assertEquals(sample_t.op(Sample.Operation.ADD, 11, 2), 13);
        assertEquals(sample_t.op(Sample.Operation.MULT, 1, 2), 2);
        assertEquals(sample_t.op(Sample.Operation.MULT, 10, 2), 20);
    }

    @Test
    void fact() {
        Sample sample_t = new Sample();
        assertEquals(sample_t.fact(5), 120);
        assertEquals(sample_t.fact(3), 6);
        assertEquals(sample_t.fact(4), 24);
    }

    @Test
    void throwillegalexeption() {
        Sample sample_t = new Sample();
        assertThrows(IllegalArgumentException.class, () -> sample_t.fact(-8));
    }
}
