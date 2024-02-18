//Find the doublet in the array whose sum is equaal to the given value x
package Arrays;
import java.util.*;
public class arraylistq1 {
    public static void main(String[] args) {
        int[] arr = {2,7,98,66,77,87};
        int x = 9;
        int  n = arr.length;
        //solution
        for (int i = 0; i < n; i++) {
            for(int j = i+1;j<n;j++){
                if(arr[i] + arr[j] == x){
                    System.out.println(arr[i]+ " "+ arr[j]);
                }
            }

        }
    }
}
