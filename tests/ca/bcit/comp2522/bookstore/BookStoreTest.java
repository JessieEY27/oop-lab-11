package ca.bcit.comp2522.bookstore;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;


import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests BookStore objects
 *
 * @author Jessie Yuen
 * @author June Pyle
 */
public class BookStoreTest
{
    BookStore b1;

    @BeforeEach
    void setUp()
    {
        b1 = new BookStore("Chapters");
    }

    @AfterEach
    void tearDown()
    {
        b1 = null;
    }

    @Test
    void testPrintAllTitles()
    {
        assertDoesNotThrow(() -> b1.printAllTitles());
    }

    @Test
    void testPrintBookTitle()
    {
        assertDoesNotThrow(() -> b1.printBookTitle("the"));
        assertDoesNotThrow(() -> b1.printBookTitle("American"));
        assertDoesNotThrow(() -> b1.printBookTitle("Man"));
        assertDoesNotThrow(() -> b1.printBookTitle("asdfghjkl"));
    }

    @Test
    void testPrintTitlesInAlphaOrder()
    {
        assertDoesNotThrow(() -> b1.printTitlesInAlphaOrder());
    }

    @Test
    void testPrintGroupByDecade()
    {
        assertDoesNotThrow(() -> b1.printGroupByDecade(1930));
        assertDoesNotThrow(() -> b1.printGroupByDecade(2026));
        assertDoesNotThrow(() -> b1.printGroupByDecade(1800));
    }

    @Test
    void testGetLongest()
    {
        assertDoesNotThrow(() -> b1.getLongest());
    }

    @Test
    void testIsThereABookWrittenBetween()
    {
        assertTrue();
        assertFalse();
    }

    @Test
    void testHowManyBooksContain()
    {
        assertEquals();
    }

    @Test
    void testWhichPercentWrittenBetween()
    {
        assertEquals();
        assertTrue();
    }

    @Test
    void testGetOldestBook()
    {
        assertEquals();
    }

    @Test
    void testGetBooksThisLength()
    {
        assertTrue();
    }

}
