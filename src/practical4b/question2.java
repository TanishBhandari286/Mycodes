package practical4b;
class Rectangle {
    private double length;
    private double breadth;

    public Rectangle() {
        this.length = 0;
        this.breadth = 0;
    }

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public Rectangle(double length) {
        this.length = length;
        this.breadth = length;
    }

    public void display() {
        System.out.println("Area: " + length * breadth);
    }
}


public class question2 {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle(5);
        Rectangle rectangle3 = new Rectangle(5, 10);

        rectangle1.display();
        rectangle2.display();
        rectangle3.display();
    }
}
