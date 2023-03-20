public class Book {
    private String bookName;
    private Author bookAuthor;
    private int  publishingYear;

    public Book(String bookName, Author bookAuthor, int publishingYear) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.publishingYear = publishingYear;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public String getBookName() {
        return bookName;
    }

    public Author getBookAuthor() {
        return bookAuthor;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }
}
