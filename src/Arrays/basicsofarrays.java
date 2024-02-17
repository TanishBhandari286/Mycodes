package Arrays;
import javax.imageio.metadata.IIOMetadataFormatImpl;
import java.util.*;
public class basicsofarrays {
    public static void main(String[] args) {
        int[] arr = new int[5];//NEW ARRAY
        arr[0] = 10;
        arr[1] = 90;
        arr[2] = 20;
        arr[3] = 80;
        arr[4] = 60;

//OUTPUT OF ARRAY
        System.out.print(arr[0] + " ");
        arr[3] = 55;//upgradation
        System.out.print(arr[3]);

        for (int i = 0; i < 4; i++) {
            System.out.print(arr[i] + " ");

        }

    }
}
