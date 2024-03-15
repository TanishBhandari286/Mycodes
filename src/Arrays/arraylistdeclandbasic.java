package Arrays;
import java.util.ArrayList;
public class arraylistdeclandbasic {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(6);//initialize
        arr.add(0,10);//this sets the value 10 at 0th index
        arr.add(1,44);//this sets the value 44 at 1st index
        arr.add(2,4);
        arr.add(3,74);
        arr.add(4,94);
        arr.add(5,49);

        System.out.println(arr.get(1));
        System.out.print(arr);
        arr.add(90);
        System.out.println();
        System.out.print(arr);

//use arr.set to modify
        //initialize arr.add
        //to print arr.get
        //we study arraylist bcoz it can grow
        //arr.size = arr.length
    }
}
