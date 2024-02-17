//Find A Numbr In Array[flag bool used]
package Arrays;
import java.util.*;
public class arraysearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter target element");
        int x = sc.nextInt();
        int[] arr = new int[5];
        System.out.println("Enter array elements");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();

        }
        boolean flag = false;
        for (int i = 0; i < 5; i++) {
            if(arr[i]==x){
                flag = true;
                break;
            }
            if(flag==true){
                System.out.println("Element found");
                break;
            }
            if(flag==false){
                System.out.println("Element found");
                break;
            }


        }
    }
}
