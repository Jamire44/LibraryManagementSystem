public class MainStaff extends MainBooks{

    public static void main(String[] args) {
    LibraryMember libraryMember = new LibraryMember();
    LibraryCatalog libraryCatalog = new LibraryCatalog();
    LibraryStaff libraryStaff = new LibraryStaff();



    LibraryMember jamie_doyle = new LibraryMember("Jamie Doyle", "087-1473522", "41 Clifton Park Shankill", libraryMember.getMembershipID(),20);
    LibraryMember johnathon_byrne = new LibraryMember("Mr. Johnathon Byrne", "087-3256585", "196 Town Cliffs Dublin", libraryMember.getMembershipID(),43);
    LibraryMember john_peter_mcNealy = new LibraryMember("John Peter McNealy", "083-4217456", "98 Fort Badge Dublin 14", libraryMember.getMembershipID(),18);
    LibraryMember marge_o_neill = new LibraryMember("Marge O'Neill", "01-2823259", "Lowes Lane Sally 18", libraryMember.getMembershipID(),87);

    libraryStaff.addNewLibraryMember(jamie_doyle);
    libraryStaff.addNewLibraryMember(johnathon_byrne);
    libraryStaff.addNewLibraryMember(john_peter_mcNealy);
    libraryStaff.addNewLibraryMember(marge_o_neill);

    libraryStaff.addBorrowingBooks(jamie_doyle, harryPotterPart2);
    System.out.println();
    libraryStaff.showBorrowedBooksAndMember();

    }
}//class
