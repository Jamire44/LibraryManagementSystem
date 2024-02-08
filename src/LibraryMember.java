public class LibraryMember {

    private String name;
    private String contactInfo;
    private String address;
    private int membershipID;
    private int age;

    public LibraryMember() {

    }

    public LibraryMember(String name, String contactInfo, String address, int membershipID, int age) {
        this.name = name;
        this.contactInfo = contactInfo;
        this.address = address;
        this.membershipID = membershipID;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getMembershipID() {
        return membershipID;
    }

    public void setMembershipID(int membershipID) {
        this.membershipID = membershipID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "<----Library Member---->" +
                "\n|Name: " + name + "\n|Contact Information: " + contactInfo + "\n|Address: " + address + "\n|Membership ID: " + membershipID + "\n|Age: " + age + "\n";
    }
}
