package practical4a;
class Student {
        String name;
        int roll_no;
        }
public class question1 {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "John";
        student.roll_no = 2;
        System.out.println("Name: " + student.name + "\nRoll No: " + student.roll_no);
    }
}
