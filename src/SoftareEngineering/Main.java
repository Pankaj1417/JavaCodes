package SoftareEngineering;


public class Main {

    public static void main(String[] args)
    {
        // This object will help to take inputs
        FastReader in = new FastReader();

        Member[] libMembers = new Member[5];
        libMembers[0] = new Member("A001", "Jack", "Jellymanland", "333133");
        libMembers[1] = new Member("A002", "John", "Jefferson County", "223133");
        libMembers[2] = new Member("A003", "Jasmine", "Timbaktu", "443133");
        libMembers[3] = new Member("A004", "Joe", "Colarado", "553133");
        libMembers[4] = new Member("A005", "Jilly", "Denver", "663133");
        Member lib1=new Member("A006", "Milly", "Denver", "663133");

      //invoking function to print member details
        System.out.println(lib1.toString());

     //For Each loop to print member details
        for(Member m: libMembers) {
            System.out.println(m.toString());
        }

        Book b1=new Book();
        b1.print();
        System.out.println("Enter Book Id  :");
        String bookIdInput = in.next();
        System.out.println("Enter Your Member Id :");
        String memberIdInput = in.next();


        System.out.println("Enter Your choice");
        System.out.println("Choice 1 is to reserve the book");
        System.out.println("Choice 2 is to borrow the book");
        System.out.println("Choice 3 is to return the book");

        int choice = in.nextInt();
        Member member = getMember(memberIdInput,libMembers);
        switch(choice){
            case 1 :
                if(member != null){
                    member.reserve(memberIdInput,bookIdInput);
                }else{
                    System.out.println("not a valid member");
                }
                break;
            case  2 :
                if(member != null){
                    member.borrow(memberIdInput,bookIdInput);
                }else{
                    System.out.println("not a valid member");
                }

               break;
            case 3 :
                if(member != null){
                    member.returnn(memberIdInput,bookIdInput);
                }else{
                    System.out.println("not a valid member");
                }
                break;
            default:
                System.out.println("Please enter valid case");
        }
    }

    // Function to get Specific member using their id
    static Member getMember(String id , Member[] arr){
        for(Member mem : arr){
            if (mem.id.equals(id)){
                return mem;
            }
        }
        return null;
    }


}

