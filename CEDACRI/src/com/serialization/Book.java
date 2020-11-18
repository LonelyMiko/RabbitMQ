package com.serialization;

/**
 * This class contains book information implements java.io.Serializable
 */
public class Book implements java.io.Serializable {
    private String title;
    private String author;
    /*transient*/ private String ISBN;
    private String genre;
    private int pageNumber;

    /**
     * Sets the title of the book
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Sets page number of the book
     * @param pageNumber
     */
    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    /**
     * Sets the author of the book
     * @param author
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * Sets the ISBN of the book
     * @param ISBN
     */
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    /**
     * Sets the genre of the book
     * @param genre
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    /**
     * Get the title of the book
     * @return title of the book
     */
    public String getTitle() {
        return title;
    }

    /**
     * Get the number of book pages
     * @return book page number
     */
    public int getPageNumber() {
        return pageNumber;
    }

    /**
     * Get the author of the book
     * @return author name
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Get the ISBN of the book
     * @return book ISBN
     */
    public String getISBN() {
        return ISBN;
    }

    /**
     * Get the genre of the book
     * @return book genre
     */
    public String getGenre() {
        return genre;
    }

    /**
     * Class constructor with all variables, used to create a new object
     * @see @param
     * @param title
     * @param pageNumber
     * @param author
     * @param ISBN
     * @param genre
     */
    public Book(String title, int pageNumber, String author, String ISBN, String genre) {
        this.title = title;
        this.pageNumber = pageNumber;
        this.author = author;
        this.ISBN = ISBN;
        this.genre = genre;
    }

    /**
     * Obtaining information about the book
     * @return book information
     */
    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", genre='" + genre + '\'' +
                ", pageNumber=" + pageNumber +
                '}';
    }
}
