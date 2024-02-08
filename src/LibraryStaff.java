import java.util.HashMap;
import java.util.Map;

public class LibraryStaff extends LibraryMember{

    private String name;
    private String position;
    private String contactInfo;
    private int staffID;
    int id = 1;

    Map<LibraryMember,Book> borrowedBooks = new HashMap<>();
    Map<Integer, LibraryMember> libraryMembers = new HashMap<>();

    LibraryCatalog libraryCatalog = new LibraryCatalog();

    public LibraryStaff(){

    }

    public LibraryStaff(String name, String position, String contactInfo, int staffID){
        this.name = name;
        this.position = position;
        this.contactInfo = contactInfo;
        this.staffID = staffID;
    }


    public void addNewLibraryMember(LibraryMember libraryMember){
        libraryMember.setMembershipID(id);
        libraryMembers.put(id++, libraryMember);
    }


    public void showLibraryMembers(){
        for (Map.Entry<Integer, LibraryMember> entry : libraryMembers.entrySet()){
            System.out.println(entry.getValue());
        }
    }

    public void lookupMemberUsingID(LibraryMember membershipID){

    }

    public void borrowingBooks(LibraryMember libraryMember, Book book){
        borrowedBooks.put(libraryMember,book);
        libraryCatalog.collectionOfBooks.remove(book);
    }

    public void showBorrowedBooks(){
        for (Map.Entry<LibraryMember, Book> entry : borrowedBooks.entrySet()){
            System.out.println(entry.getKey().getMembershipID() + " : " + entry.getValue());
        }
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public int getStaffID() {
        return staffID;
    }

    public void setStaffID(int staffID) {
        this.staffID = staffID;
    }


}//class
