import java.util.*;

public  class LibraryCatalog {

    public Map<Integer,Book> collectionOfBooks = new HashMap<>();
    private int id = 1;



    public void addBook(Book book){
        // Add books into HashMap
        collectionOfBooks.put(id++, book);
    }

    public void removeBook(int id){

        // Remove ID-Pair
        collectionOfBooks.remove(id);
        // Iterate over remaining ID's
        // --> remove the book, decrement the ID by 1, put the book in the new ID
            for (int i = id + 1; i < this.id; i++){
                collectionOfBooks.put(i - 1 ,collectionOfBooks.remove(i));
            this.id--;
        }
    }


    public void show(){
        // Map entry allows us to use methods like getKey and getValue
        // Entry = Key/Value Pair
        // For every entry in the HashMap Set
        for (Map.Entry<Integer, Book> entry : collectionOfBooks.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    public void searchByTitle(String title){

        for (Map.Entry<Integer, Book> entry : collectionOfBooks.entrySet()){
            if (entry.getValue().getTitle().equals(title)){
                System.out.println(entry.getValue());
            }

        }

    }

    public void searchByID(int id){
        for (Map.Entry<Integer, Book> entry : collectionOfBooks.entrySet()){
            if(entry.getKey().equals(id)){
                System.out.println(entry.getValue());
            }
        }
    }





}
