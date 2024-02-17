// Q1. Given an array of students, if the mark of any student is less than 35 print its roll number. [roll no here refers to the index of the array]
package Arrays;
import java.util.*;
public class arrayq1 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter Student's Marks" + " ");
            arr[i] = sc.nextInt();

        }

        for (int i = 0; i < 10; i++) {
            if(arr[i]<35){

                System.out.print(i + " ");

            }


        }
        System.out.println("The above students have scored less than 35 marks");
    }
}
