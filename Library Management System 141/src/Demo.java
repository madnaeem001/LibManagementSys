public class Demo {

    public static void main(String[] args) {
        Library lib = new Library();

        Book book1 = new Book("Moth Smoke", "Mohsin Hamid", 2000 , 247);
        Book book2 = new Book("The Reluctant Fundamentalist", "Mohsin Hamid", 2007 , 184);
        Magazine magazine1 = new Magazine("Dastaan-e-Pakistan", "History Dept", 2022, 5);

        lib.addItem(book1);
        lib.addItem(book2);
        lib.addItem(magazine1);

        lib.borrowItem(book1);

        System.out.println("Available Items:");
        lib.displayAvailableItems();
        System.out.println("\nBorrowed Items:");
        lib.displayBorrowedItems();

        lib.returnItem(book1);
        System.out.println("\nAfter returning 'Moth Smoke':");
        System.out.println("Available Items:");
        lib.displayAvailableItems();
        System.out.println("\nBorrowed Items:");
        lib.displayBorrowedItems();


    }
}
