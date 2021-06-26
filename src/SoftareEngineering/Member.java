package SoftareEngineering;

public class Member {
    Book book = new Book();
    String id, name, address, phone;// 1.class level variable
// Member is a constructor of class Member
    Member(String id, String name, String address, String phone) {
        this.id = id;
        this.name = name;// shadowing variable
        this.address = address;
        this.phone = phone;
    }
    public String toString() {
        return("Student details are as follows Id  is"+id+"\t Name is"+name+"\t Address is"
                +address+"Contact no is"+phone);
    }
    public void reserve(String memb_id , String book_id) {
        if(getBookIfPresent(book_id, book.bookTitle).isPresent){
            int row = getBookIfPresent(book_id,book.bookTitle).row;
            int count = Integer.parseInt(book.bookTitle[row][3]);
            book.bookTitle[row][3] = String.valueOf(count-1);
            System.out.println("Book with Title :"+book.bookTitle[row][2]+" has been Resrved by Member " +
                    "having id :" +memb_id);
        }else{
            System.out.println("Book is not available");
        }
    }
    public void borrow(String memb_id , String book_id) {
        if(getBookIfPresent(book_id, book.bookTitle).isPresent){
            int row = getBookIfPresent(book_id,book.bookTitle).row;
            int count = Integer.parseInt(book.bookTitle[row][3]);
            if(count > 0){
                book.bookTitle[row][3] = String.valueOf(count-1);
                System.out.println("Book with Title :"+book.bookTitle[row][2]+" has been Borrowed by Member " +
                        "having id :" +memb_id);
            }else{
                System.out.println("Out of stock");
            }

        }else{
            System.out.println("Book is not available");
        }
    }
    public void returnn(String memb_id , String book_id) {
        int row = getBookIfPresent(book_id,book.bookTitle).row;
        int count = Integer.parseInt(book.bookTitle[row][3]);
        book.bookTitle[row][3] = String.valueOf(count+1);
        System.out.println("Book with Title :"+book.bookTitle[row][2]+" has been Returned " +
                "by Member having id :"+memb_id);
    }
     Pair getBookIfPresent(String id , String[][] books ){
        Pair p = new Pair();
        int index =0;
        for (String[] book : books){
            if(book[0].equals(id)){
                p.isPresent = true;
                p.row = index;
            }
            index++;
        }
        return p;
    }

     static class Pair {
        boolean isPresent = false;
        int row = -1;
    }
}