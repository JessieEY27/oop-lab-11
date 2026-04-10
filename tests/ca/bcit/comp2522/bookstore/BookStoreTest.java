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
    BookStore b2;
    BookStore b3;


    @BeforeEach
    void setUp()
    {
        b1 = new BookStore("Chapters", );
        b2 = new BookStore("Indigo", );
        b3 = new BookStore("Coles", );
    }

    @AfterEach
    void tearDown()
    {
        b1 = null;
        b2 = null;
        b3 = null;
    }

    @Test
    void testPrintAllTitles()
    {
        assertEquals(, b1.printAllTitles();)
        assertEquals(, b2.printAllTitles();)
    }

    @Test
    void testPrintBookTitle()
    {
        assertEquals(, b1.printBookTitle();)
        assertEquals(, b2.printBookTitle();)
    }

    @Test
    void testPrintTitlesInAlphaOrder()
    {
        assertEquals(, b1.printTitlesInAlphaOrder();)
        assertEquals(, b2.printTitlesInAlphaOrder();)
    }

    @Test
    void testPrintGroupByDecade()
    {
        assertEquals(, b1.printGroupByDecade();)
        assertEquals(, b2.printGroupByDecade();)
    }

    @Test
    void testGetLongest()
    {
        assertEquals(, b1.getLongest();)
        assertEquals(, b2.getLongest();)
    }

    @Test
    void testIsThereABookWrittenBetween()
    {

    }

    @Test
    void testHowManyBooksContain()
    {

    }

    @Test
    void testWhichPercentWrittenBetween()
    {

    }

    @Test
    void testGetOldestBook()
    {

    }

    @Test
    void testGetBooksThisLength()
    {

    }

}
