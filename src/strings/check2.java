package strings;
class Printer {
    public void print(int num) {
        System.out.println("Printing integer: " + num);
    }

    public void print(double num) {
        System.out.println("Printing double: " + num);
    }
}


public class check2 {
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.print(10);
        printer.print(10.5);
    }
}
