package practical4b;
class Student {
    private String name;

    public Student() {
        this.name = "Unknown";
    }

    public Student(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Name: " + name);
    }
}

public class question1 {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student("Tanish");
        Student student3 = new Student("Rudra");
        Student student4 = new Student("Vaishnavi");
        Student student5 = new Student("Sneha");

        student1.display();
        student2.display();
        student3.display();
        student4.display();
        student5.display();
    }
}
