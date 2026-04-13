package ca.bcit.comp2522.bookstore;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;


import java.util.ArrayList;
import java.util.List;

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
        assertTrue(b1.isThereABookWrittenBetween(1954));
        assertFalse(b1.isThereABookWrittenBetween(2026));
    }

    @Test
    void testHowManyBooksContain()
    {
        final int count1;
        final int count2;

        count1 = b1.howManyBooksContain("Ring");
        count2 = b1.howManyBooksContain("Spaghettification");

        assertEquals(1,
                     count1);
        assertEquals(0,
                     count2);
    }

    @Test
    void testWhichPercentWrittenBetween()
    {
        final int lowYear1;
        final int highYear1;
        final int lowYear2;
        final int highYear2;
        final double result1;
        final double result2;

        lowYear1 = 1900;
        highYear1 = 2000;
        lowYear2 = 1850;
        highYear2 = 1860;

        result1 = b1.whichPercentWrittenBetween(lowYear1,
                                                highYear1);
        result2 = b1.whichPercentWrittenBetween(lowYear2,
                                                 highYear2);

        assertEquals(97.0,
                     result1);
        assertEquals(0.0,
                     result2);
    }

    @Test
    void testGetOldestBook()
    {
        assertEquals("A Passage to India",
                     b1.getOldestBook().getTitle());
    }

    @Test
    void testGetBooksThisLength()
    {
        final List<Novel> result1;
        final List<Novel> result2;
        final List<Novel> expected1;
        final List<Novel> expected2;


        result1 = b1.getBooksThisLength(4);
        result2 = b1.getBooksThisLength(0);

        expected1 = new ArrayList<>();
        expected1.add(new Novel("1984",
                              "George Orwell",
                              1948));
        expected1.add(new Novel("Ubik",
                              "Philip K. Dick",
                              1969));

        expected2 = new ArrayList<>();

        assertEquals(expected1.stream().map(Object::toString).toList(),
                     result1.stream().map(Object::toString).toList());
        assertEquals(expected2, result2);
    }

}
