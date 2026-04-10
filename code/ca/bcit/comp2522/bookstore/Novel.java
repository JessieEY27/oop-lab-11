package ca.bcit.comp2522.bookstore;

/**
 * Represents a Novel object.
 *
 * @author Jessie Yuen
 * @author June Pyle
 *
 * @version 1
 */
public class Novel
{

    private static final int MIN_PUBLICATION_YEAR = 1900;
    private static final int MAX_PUBLICATION_YEAR = 2010;

    private final String title;
    private final String authorName;
    private final int yearPublished;

    /**
     * Constructs a Novel.
     *
     * @param title the novel's title
     * @param authorName the novel's author's name
     * @param yearPublished the novel's publication year
     */
    public Novel(final String title,
                 final String authorName,
                 final int yearPublished) {
        this.title = validateTitle(title);
        this.authorName = validateAuthorName(authorName);
        this.yearPublished = validatePublicationYear(yearPublished);
    }

    /**
     * Validates title of novel.
     *
     * @param title the novel's title
     * @return title of novel
     */
    private static String validateTitle(final String title)
    {
        if(title == null ||
                title.isEmpty())
        {
            throw new IllegalArgumentException("Invalid title.");
        }
        return title;
    }

    /**
     * Validates author of novel's name.
     *
     * @param authorName the author's name
     * @return name of author
     */
    private static String validateAuthorName(final String authorName)
    {
        if(authorName == null ||
                authorName.isEmpty())
        {
            throw new IllegalArgumentException("Invalid author name.");
        }
        return authorName;
    }

    /**
     * Validates year of novel's publication.
     *
     * @param year the year of novel's publication
     * @return novel's publication year
     */
    private static int validatePublicationYear(final int year)
    {
        if(year < MIN_PUBLICATION_YEAR ||
                year > MAX_PUBLICATION_YEAR)
        {
            throw new IllegalArgumentException("Invalid year, year must be between MIN_PUBLICATION_YEAR and MAX_PUBLICATION_YEAR.");
        }
        return year;
    }

    /**
     * Gets the title of the novel.
     *
     * @return title of the novel
     */
    public String getTitle()
    {
        return title;
    }

    /**
     * Gets the author name of the novel.
     *
     * @return novel's author's name
     */
    public String getAuthorName()
    {
        return authorName;
    }

    /**
     * Gets the publication year of the novel.
     *
     * @return novel's publication year
     */
    public int getYearPublished()
    {
        return yearPublished;
    }

    @Override
    public String toString()
    {
        return title + ", " + authorName + ", " + yearPublished;
    }
}
