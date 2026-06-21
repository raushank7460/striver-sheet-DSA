package immersion;
import java.util.*;

public class missingNumber {

    public static int misNumber(int[] arr) {
        int xor = arr.length;
        // for (int i = 0; i < arr.length; i++) {
        //     xor ^= i ^ arr[i];
        // }
        // return xor;

   int n=arr.length;
        int total = (n * (n+1))/2;
        int sum = 0;
        for (int i=0; i<n; i++) sum += arr[i];
        return total - sum; 
        
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