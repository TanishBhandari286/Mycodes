package practical4b;
class StudentData {
private int stuID;
private String stuName;
private int stuAge;

public StudentData() {
    this.stuID = 0;
    this.stuName = "Unknown";
    this.stuAge = 0;
}

public StudentData(int stuID, String stuName, int stuAge) {
    this.stuID = stuID;
    this.stuName = stuName;
    this.stuAge = stuAge;
}

public StudentData(StudentData studentData) {
    this.stuID = studentData.stuID;
    this.stuName = studentData.stuName;
    this.stuAge = studentData.stuAge;
}

public void display() {
    System.out.println("Student ID: " + stuID);
    System.out.println("Student Name: " + stuName);
    System.out.println("Student Age: " + stuAge);
}

public int getStuID() {
    return stuID;
}

public void setStuID(int stuID) {
    this.stuID = stuID;
}

public String getStuName() {
    return stuName;
}

public void setStuName(String stuName) {
    this.stuName = stuName;
}

public int getStuAge() {
    return stuAge;
}

public void setStuAge(int stuAge) {
    this.stuAge = stuAge;
}
}

public class question3 {
    public static void main(String[] args) {
        StudentData studentData1 = new StudentData();
        StudentData studentData2 = new StudentData(1, "Tanish", 19);
        StudentData studentData3 = new StudentData(studentData2);

        studentData1.display();
        studentData2.display();
        studentData3.display();
    }
}
