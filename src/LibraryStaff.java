import java.util.HashMap;
import java.util.Map;

public class LibraryStaff extends Book{

    private String name;
    private String position;
    private String contactInfo;
    private int staffID;
    int id = 1;

    Map<LibraryMember,Book> borrowedBooks = new HashMap<>();
    Map<Integer, LibraryMember> libraryMembersInMap = new HashMap<>();

    private LibraryCatalog libraryCatalog;

    public LibraryCatalog getLibraryCatalog() {
        return libraryCatalog;
    }

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
        libraryMembersInMap.put(id++, libraryMember);
    }


    public void showLibraryMembers(){
        for (Map.Entry<Integer, LibraryMember> entry : libraryMembersInMap.entrySet()){
            System.out.println(entry.getValue());
        }
    }

    public void lookupMemberUsingID(int id){
        for (Map.Entry<Integer, LibraryMember> entry : libraryMembersInMap.entrySet()){
            if(entry.getKey().equals(id)){
                System.out.println(entry.getValue());
            }
        }
    }

    public void addBorrowingBooks(LibraryMember libraryMember, Book book) {
        borrowedBooks.put(libraryMember, book);
    }

    public void showBorrowedBooksAndMember(){
        for (Map.Entry<LibraryMember, Book> entry : borrowedBooks.entrySet()){
            System.out.println(entry.getValue());
            lookupMemberUsingID(entry.getKey().getMembershipID());
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
