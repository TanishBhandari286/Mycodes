package objectops;

public class ConstructorBasic {
    public static void main(String[] args) {
        Student tanish = new Student(17, 489 , 99);
        System.out.print("my roll number is ");
        System.out.println(tanish.rollno);
        System.out.print("my marks are ");
        System.out.println(tanish.marks);
        System.out.print("my percentage is ");
        System.out.println(tanish.perc);
    }
}


class Student{
    int rollno;
    int marks;
    float perc;

    Student(int rollno, int marks, float perc){
        this.rollno=rollno;
        this.perc = perc;
        this.marks = marks;

    }
}