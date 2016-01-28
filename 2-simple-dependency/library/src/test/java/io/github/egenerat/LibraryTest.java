package io.github.egenerat;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class LibraryTest extends TestCase {
    /**
     * Create the test case
     *
     */
    public LibraryTest() {
        super();
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite( LibraryTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp() {
        assertEquals("Let's try if getHardcodedValue() is working: ", 11, Library.getHardcodedValue() );
    }

    /*public void testApp2() {
        assertEquals("Error message!", 12, Library.getHardcodedValue() );
    }

    public void testApp3() {
        assertEquals(13, Library.getHardcodedValue() );
    }*/
}
