import java.util.ArrayList;

public class Assignment42 {
    static  class Book {
        String title;
        boolean borrowed;


        public Book(String title) {
            this.title = title;
            borrowed = false;
        }

        public void borrowed() {
            borrowed = true;
        }
        public void returned() {

            borrowed = false;
        }
        public void rented() {

            borrowed = true;
        }

        public boolean isBorrowed() {
            if (borrowed) {
                return true;
            }
            else {
                return false;
            }
        }
        public String getTitle() {
            return  title;
        }
    }

    static class  Library {
        String address;
        ArrayList<Book> bookList = new ArrayList<>();

        Library (String address) {
            this.address = address;
        }

        void addBook (Book book) {
            bookList.add(book);
        }

        static void printOpeningHours() {
            System.out.println("Libraries are open daily from 9am to 5pm.");
        }
        public void printAddress() {
            System.out.println(address);
        }

        public void borrowBook(String bookName) {
            boolean found = false;
            for (Book book : bookList) {
                if (book.getTitle().equals(bookName)) {
                    found = true;
                    if (!(book.isBorrowed())) {
                        book.borrowed();
                        System.out.println("You successfully borrowed " + bookName);
                    }
                    else {
                        System.out.println("Sorry, this book is already borrowed");
                    }
                }
            }
            if (!found)
                System.out.println("Sorry, this book is not in out catalog");
        }

        public void printAvailableBooks() {
            for (Book book : bookList) {
                if (!(book.isBorrowed())) {
                    System.out.println(book.getTitle());
                }
            }
            if (bookList.isEmpty()) {
                System.out.println("No book in catalog");
            }
        }

        public void returnBook(String bookName){
            for (Book book : bookList) {
                if (book.getTitle().equals(bookName)) {
                        book.returned();
                        System.out.println("You successfully returned " + bookName);
                }
            }
        }
    }

    public static void main(String[] args) {
// Create two libraries

        Library firstLibrary = new Library("10 Main St.");
        Library secondLibrary = new Library("228 Liberty St.");
// Add four books to the first library
        firstLibrary.addBook(new Book("The Da Vinci Code"));
        firstLibrary.addBook(new Book("Le Petite Prince"));
        firstLibrary.addBook(new Book("A Tale of Two Cities"));
        firstLibrary.addBook(new Book("The Lord of the Rings"));
// Print opening hours and the addresses
        System.out.println("Library hours:");
        Library.printOpeningHours();
        System.out.println();

        System.out.println("Library addresses:");
        firstLibrary.printAddress();
        secondLibrary.printAddress();
        System.out.println();

        // Try to borrow The Lords of the Rings from both libraries
        System.out.println("Borrowing The Lord of the Rings:");
        System.out.println("***");
        firstLibrary.borrowBook("xyuz");
        System.out.println("***");
        firstLibrary.borrowBook("The Lord of the Rings");
        secondLibrary.borrowBook("The Lord of the Rings");
        System.out.println();


// Print the titles of all available books from both libraries
            System.out.println("Books available in the first library:");
            firstLibrary.printAvailableBooks();
            System.out.println();
            System.out.println("Books available in the second library:");
            secondLibrary.printAvailableBooks();
            System.out.println();

// Return The Lords of the Rings to the first library
            System.out.println("Returning The Lord of the Rings:");
            firstLibrary.returnBook("The Lord of the Rings");
            System.out.println();

// Print the titles of available from the first library
            System.out.println("Books available in the first library:");
            firstLibrary.printAvailableBooks();

    }
}
