package javv;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class JunitTest {

    StringUtil util;

    // Setup method
    @Before
    public void setUp() {

        util = new StringUtil();

        System.out.println("Setup done");
    }

    // Teardown method
    @After
    public void tearDown() {

        util = null;

        System.out.println("Teardown done");
    }

    @Test
    public void testReverse() {

        // Act
        String reversed = util.reverse("hello");

        // Assert
        assertEquals("olleh", reversed);
    }

    @Test
    public void testPalindromeTrue() {

        String word = "madam";

        boolean result = util.isPalindrome(word);

        assertTrue(result);
    }

    @Test
    public void testPalindromeFalse() {

        String word = "hello";

        boolean result = util.isPalindrome(word);

        assertFalse(result);
    }
}