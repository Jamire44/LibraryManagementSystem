public class Book extends LibraryCatalog{

    private String title;
    private String author;
    private String ISBN;
    private String genre;
    private int publicationYear;

    public Book(){
    }

    public Book(String title, String author, String ISBN, String genre, int publicationYear){
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.genre = genre;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    @Override
    public String toString() {
        return "<-- ID" +
                "\n|Title: " + title + "\n|Author: " + author + "\n|ISBN: " + ISBN + "\n|Genre: " + genre + "\n|Publication Year: " + publicationYear + "\n";
    }
}
