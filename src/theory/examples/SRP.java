package theory.examples;

public class SRP {

    // Book is responsible for holding book details
    // BookPrinter is responsible for printing them
    class Book {
        private String title;
        private String author;

        // Getters and setters

        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }
    }

    class BookPrinter {
        public void printBookDetails(Book book) {
            System.out.println(book.getTitle() + " by " + book.getAuthor());
        }
    }

}
