//calculate the sum of all elements in the given array
package Arrays;
import java.util.*;
public class arraysq2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        for (int i = 0; i<6 ; i++) {
            System.out.println("Enter Numbers");
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < 6; i++) {
            sum+=arr[i];
        }
        System.out.println("The Sum of the numbers you entered is " + " ");
        System.out.print(sum);

    }
}
