package n1exercici1.test;

import n1exercici1.main.Year;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class YearTest {
    private Year year;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        year = new Year();
    }

    @org.junit.jupiter.api.Test
    void testNotNull() {
        assertNotNull(year.getMonths(), "La lista no es nula");
    }

    @Test
    void test12Months () {
        assertEquals(12, year.getMonths().size());
    }

    @Test
    void testAugust () {
        assertEquals("agosto", year.getMonths().get(7));
    }

}