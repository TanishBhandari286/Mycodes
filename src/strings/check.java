package strings;
class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }
}
public class check {
    public static void main(String[] args) {
                Calculator calc = new Calculator();
                System.out.println(calc.add(2, 3));
                System.out.println(calc.add(2, 3, 4));
            }
        }


