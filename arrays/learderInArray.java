import java.util.*;

public class learderInArray {
    public static void main(String[] args) {

        int[] nums = {16, 17, 4, 3, 5, 2};
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {

            boolean isLeader = true;   // Reset for every element

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] > nums[i]) {
                    isLeader = false;
                    break;
                }
            }

            if (isLeader) {
                ans.add(nums[i]);
            }
        }

        for (int x : ans) {
            System.out.print(x + " ");
        }
    }
}