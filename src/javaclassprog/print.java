package javaclassprog;

import static javaclassprog.Car.printcar;

class print {
    public static void main(String[] args) {
        Car c1 = new Car();
        Motorcycle m1 = new Motorcycle();
        c1.printvehicle();
        printcar();
        m1.printMotorcycle();

    }
}
