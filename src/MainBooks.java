public class MainBooks {

    static Book horridHenry = new Book("Horrid Henry", "Michael Doyle", "5325-2355", "Children", 1999);
    static Book harryPotter = new Book("Harry Potter", "J.K. Rowling", "6548-5262", "Adult/Children",1992);
    static Book harryPotterPart2 = new Book("Harry Potter Part 2", "J.K. Rowling", "6548-5264", "Adult/Children",1993);
    static Book harryPotterPart3 = new Book("Harry Potter Part 3", "J.K. Rowling", "9048-5221", "Adult/Children",1999);
    static Book harryPotterPart4 = new Book("Harry Potter Part 4", "J.K. Rowling", "4248-5262", "Adult/Children",2006);

    public static void main(String[] args) {

        LibraryCatalog libraryCatalog = new LibraryCatalog();

        libraryCatalog.addBook(horridHenry);
        libraryCatalog.addBook(harryPotter);
        libraryCatalog.addBook(harryPotterPart2);
        libraryCatalog.addBook(harryPotterPart3);
        libraryCatalog.addBook(harryPotterPart4);

        libraryCatalog.show();




    }
}
