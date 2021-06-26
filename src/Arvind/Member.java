package Arvind;

public class Member {

    String id, name, address, phone;// 1.class level variable

    // Member is a constructor of class Member

    Member(String idd, String nname, String aaddress, String pphone) {
        this.id = idd;
        this.name = nname;// shadowing variable
        this.address = aaddress;
        this.phone = pphone;
    }

    public String toString() {
        return("Student details are as follows Id is"+id+"\t Name is"+name+"\t Address is"
                +address+"Contact no is"+phone);
    }

    public void reserve(String id) {
        System.out.println("Book has been reserved");
    }

    public void borrow(String id) {
        System.out.println("Book has been borrowed");

    }

    public void returnn(String id) {
        System.out.println("Book has been returned");

    }

}
