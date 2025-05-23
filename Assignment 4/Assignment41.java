public class Assignment41 {
    static  class Book {
        String title;
        boolean borrowed;
            // Creates a new Book
        public Book(String title) {
            this.title = title;
            borrowed = false;
            }
            // Marks the book as rented
        public void borrowed() {

        }
            // Marks the book as not rented
        public void returned() {
            borrowed = false;
        }
        public void rented() {
            borrowed = true;
        }
            // Returns true if the book is rented, false otherwise
       public boolean isBorrowed() {
            if (borrowed) {
                return true;
            }
            else {
                return false;
            }
       }

            // Returns the title of the book
       public String getTitle() {
            return  title;
       }

    }
    public static void main(String[] arguments) {
// Small test of the Book class
        Book example = new Book("The Da Vinci Code");
        System.out.println("Title (should be The Da Vinci Code): " + example.getTitle());
        System.out.println("Borrowed? (should be false): " + example.isBorrowed());
        example.rented();
        System.out.println("Borrowed? (should be true): " + example.isBorrowed());
        example.returned();
        System.out.println("Borrowed? (should be false): " + example.isBorrowed());
    }
}
