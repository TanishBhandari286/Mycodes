package javaclassprog2;
 class zebb extends Animal{
    public static void printzebb(){
        System.out.println("I am a black and white animal");
    }
}
public class zebra{
    public static void main(String[] args) {
        zebb z1 = new zebb();
        Bird b1 = new Bird();
        Fish f1 = new Fish();
        z1.printzebb();
        b1.printbird();
        f1.printfish();


    }

    }

