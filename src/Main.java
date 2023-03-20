public class Main {
    public static void main(String[] args) {
        Author firstAuthor = new Author("Stethen", "King");
        Author secondAuthor = new Author("Leo", "Tolstoy");

        Book firstBook = new Book("The Shining", firstAuthor, 1977);
        System.out.println("'" + firstBook.getBookName() + "'" + " by " + firstBook.getBookAuthor().getFirstName() + " " + firstBook.getBookAuthor().getFamilyName()+ " was published in " + firstBook.getPublishingYear());
        firstBook.setPublishingYear(2023);
        System.out.println("'" + firstBook.getBookName() + "'" + " by " + firstBook.getBookAuthor().getFirstName() + " " + firstBook.getBookAuthor().getFamilyName()+ " was published in " + firstBook.getPublishingYear() + ", again");
        System.out.println();

        Book secondBook = new Book("Anna Karenina", secondAuthor, 1877);
        System.out.println("'" + secondBook.getBookName() + "'" + " by " + secondBook.getBookAuthor().getFirstName() + " " + secondBook.getBookAuthor().getFamilyName()+ " was published in " + secondBook.getPublishingYear());
        secondBook.setPublishingYear(2002);
        System.out.println("'" + secondBook.getBookName() + "'" + " by " + secondBook.getBookAuthor().getFirstName() + " " + secondBook.getBookAuthor().getFamilyName()+ " was published in " + secondBook.getPublishingYear() + ", again");


        // The Shining
    } // end of main
} //end of Main