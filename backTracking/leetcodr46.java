package backTracking;
import java.util.*;

public class leetcodr46 {

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(nums, new ArrayList<>(), new boolean[nums.length], ans);
        return ans;
    }

    private static void backtrack(int[] nums, List<Integer> curr,
                                  boolean[] used, List<List<Integer>> ans) {

        if (curr.size() == nums.length) {
            ans.add(new ArrayList<>(curr));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue;

            used[i] = true;
            curr.add(nums[i]);

            backtrack(nums, curr, used, ans);

            curr.remove(curr.size() - 1);
            used[i] = false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   // Number of elements
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        List<List<Integer>> result = permute(nums);

        System.out.println(result);
    }
}