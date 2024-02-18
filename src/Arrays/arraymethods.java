package Arrays;

public class arraymethods {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        System.out.println(arr[0]);
        change(arr);
        System.out.println(arr[0]);


    }

    //passed by reference
    public static void change(int[] arr) {
        arr[0] = 100;
    }
}
//integer dont get updated they get passed by value
//        int x = 5;
//        System.out.println(x);
//        change(x);
//        System.out.println(x);


//    public static void change(int x) {
//        x = 10;

