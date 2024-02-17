//maximum number in array
package Arrays;
import java.util.*;
public class maxvaluearray {
    public static void main(String[] args) {
        int[] arr = new int[8];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 8; i++) {
            System.out.println("Enter Elements Of Array");
            arr[i] = sc.nextInt();
        }
        int mx = arr[0];
        for (int i = 1; i < 8; i++) {
            if(arr[i]>mx){
                mx = arr[i];
            }

        }
        System.out.println("The max number in array is");
        System.out.println(mx);

    }
}
