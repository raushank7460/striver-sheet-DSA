package immersion;
import java.util.*;

public class missingNumber {

    public static int misNumber(int[] arr) {
        int xor = arr.length;

        for (int i = 0; i < arr.length; i++) {
            xor ^= i ^ arr[i];
        }

        return xor;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int n = sc.nextInt();

        System.out.println("Enter elements:");
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(misNumber(arr));
        
    }
}