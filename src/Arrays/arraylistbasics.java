package Arrays;
import java.util.*;
public class arraylistbasics {
    public static void main(String[] args) {
        int[] arr = {10,20,30,60,66};

        for(int ele : arr){
            System.out.println(ele + " ");

        }
//        System.out.println();
//        Arrays.sort(arr);
//        for (int i = 0; i <n ; i++) {
//            System.out.print(arr[i] + " ");
//
//    }
        int[] nums = arr;
        for(int x : nums)
            //shallow copy
            System.out.println(x);
        int[] brr = Arrays.copyOf(arr,arr.length);
        brr[0] = 70;
        //deep copy different Arrau got generated
        System.out.println(brr[0]);

}}
//nums and arr are two names of the same array
