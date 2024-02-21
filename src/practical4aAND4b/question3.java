package practical4aAND4b;
class Area {
    // Constructor
    int length;
    int breadth;

    public Area(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int returnArea() {
        return length * breadth;
    }
}


public class question3 {
    public static void main(String[] args) {
        Area area = new Area(5, 10);
        System.out.println("Area: " + area.returnArea());
    }
}
