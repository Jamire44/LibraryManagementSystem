public class LibraryStaff {

    private String name;
    private String position;
    private String contactInfo;
    private int staffID;

    public LibraryStaff(String name, String position, String contactInfo, int staffID){
        this.name = name;
        this.position = position;
        this.contactInfo = contactInfo;
        this.staffID = staffID;
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
