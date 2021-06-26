package ComparableAndComparators;
import java.util.*;
public class MainClass {
public static void main(String[] args) {
    List<Student> students = new LinkedList<>();
    students.add(new Student(23, "pankaj"));
    students.add(new Student(15, "kajal"));
    students.add(new Student(10, "palak"));
    students.add(new Student(23, "tanisha"));
//     Collections.sort(students , new sortByNameThenMarks());
//     Collections.sort(students, new Comparator<Student>() {
//         @Override
//         public int compare(Student o1, Student o2) {
//             if(o1.name.equals(o2.marks)){
//            return o1.marks -o2.marks;
//        }else{
//            return o1.name.compareTo(o2.name);
//        }
//         }
//     });
    Collections.sort(students,( o1,  o2) ->{
            if(o1.name.equals(o2.marks)){
                return o1.marks -o2.marks;
            }else{
                return o1.name.compareTo(o2.name);
            }
        });
   students.forEach(System.out::println);

     }
}
//class sortByNameThenMarks implements Comparator<Student>{
//
//    @Override
//    public int compare(Student o1, Student o2) {
//        if(o1.name.equals(o2.marks)){
//            return o1.marks -o2.marks;
//        }else{
//            return o1.name.compareTo(o2.name);
//        }
//    }

