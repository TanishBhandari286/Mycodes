package Arrays;
import java.util.*;
public class takinginput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //input
        int[] arr = new int[5];
        for (int i = 0; i < 4; i++) {
            System.out.println("Enter Numbers :");
            arr[i] = sc.nextInt();

        }
        //output
        for (int i = 0; i < 4; i++) {
            System.out.print("The numbers you entered is ");
            System.out.print(arr[i] + " ");

        }


    }
}
