package Arrays;
import java.util.*;
public class maxvaluearraym2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[7];
        System.out.println("Enter Elements Of Array");
        for (int i = 0; i < 7; i++) {
            arr[i] = sc.nextInt();
        }
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i < 7; i++) {
            if(arr[i]>mx)
                mx = arr[i];
        }
        System.out.println("The max value in this array is");
        System.out.println(mx);
    }
}
