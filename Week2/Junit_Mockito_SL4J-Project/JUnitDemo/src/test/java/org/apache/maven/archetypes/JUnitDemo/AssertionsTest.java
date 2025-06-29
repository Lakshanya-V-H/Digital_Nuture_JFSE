package org.apache.maven.archetypes.JUnitDemo;

import org.junit.Test;
import static org.junit.Assert.*;

public class AssertionsTest {

    @Test
    public void testAssertions() {
        // Assert that two values are equal
        assertEquals(5, 2 + 3);

        // Assert that a condition is true
        assertTrue(5 > 3);

        // Assert that a condition is false
        assertFalse(5 < 3);

        // Assert that a value is null
        assertNull(null);

        // Assert that a value is not null
        assertNotNull(new Object());
    }
}
