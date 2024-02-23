package practical4a;
import java.util.Scanner;
class Complex {
    int real;
    int imaginary;

    public Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public void sum(Complex c1, Complex c2) {
        int realSum = c1.real + c2.real;
        int imaginarySum = c1.imaginary + c2.imaginary;
        System.out.println("Sum: " + realSum + " + " + imaginarySum + "i");
    }

    public void difference(Complex c1, Complex c2) {
        int realDifference = c1.real - c2.real;
        int imaginaryDifference = c1.imaginary - c2.imaginary;
        System.out.println("Difference: " + realDifference + " + " + imaginaryDifference + "i");
    }

    public void product(Complex c1, Complex c2) {
        int realProduct = c1.real * c2.real - c1.imaginary * c2.imaginary;
        int imaginaryProduct = c1.real * c2.imaginary + c1.imaginary * c2.real;
        System.out.println("Product: " + realProduct + " + " + imaginaryProduct + "i");
    }
}

public class question4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the real part of the first complex number:");
        int real1 = input.nextInt();
        System.out.println("Enter the imaginary part of the first complex number:");
        int imaginary1 = input.nextInt();
        System.out.println("Enter the real part of the second complex number:");
        int real2 = input.nextInt();
        System.out.println("Enter the imaginary part of the second complex number:");
        int imaginary2 = input.nextInt();
        Complex c1 = new Complex(real1, imaginary1);
        Complex c2 = new Complex(real2, imaginary2);
        c1.sum(c1, c2);
        c1.difference(c1, c2);
        c1.product(c1, c2);
    }
}
