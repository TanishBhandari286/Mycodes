package conditionalsloopscalculator;
import java.util.Scanner;
public class conditions {
    public static void main(String[] args) {
        int max;
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        max = Math.max(c, Math.max(a, b));
        System.out.println(max);




    }
}
