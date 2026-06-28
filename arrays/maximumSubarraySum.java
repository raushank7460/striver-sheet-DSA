package arrays;

public class maximumSubarraySum {
    //public static void main(String[] args) {
        int[]nums = {-2,1,-3,4,-1,2,1,-5,4};
        // int max=Integer.MIN_VALUE;
        // for(int i=0;i<nums.length;i++){
        //     int sum=0;
        //     for(int j=i;j<nums.length;j++){
        //         sum+=nums[j];
        //         max=Math.max(max,sum);
        //     }
        // }
        // System.out.println(max);
        
   // }
//    optimal Solution
public static void main(String[] args) {
    int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
    int maxSum=nums[0];
    int currSum=nums[0];
    for(int i=0;i<nums.length;i++){
        currSum=Math.max(nums[i],currSum+nums[i] );
        maxSum=Math.max(maxSum, currSum);
    }
    System.out.println(maxSum);

    
}
    
}
