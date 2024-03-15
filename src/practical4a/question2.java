package practical4a;
class Triangle {
    int side1 = 3;
    int side2 = 4;
    int side3 = 5;

    public void area() {
        double s = (side1 + side2 + side3) / 2.0;
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        System.out.println("Area: " + area);
    }

    public void perimeter() {
        int perimeter = side1 + side2 + side3;
        System.out.println("Perimeter: " + perimeter);
    }
}
public class question2 {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.area();
        triangle.perimeter();
    }
}