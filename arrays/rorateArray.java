package arrays;

public class rorateArray {
    private static void reverse(int []nums,int st,int end){
        while(st<end){
            int temp=nums[st];
            nums[st]=nums[end];
            nums[end]=temp;
            st++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[]nums = {1,2,3,4,5,6,7};
        int n=nums.length;
        int k=2;
        k=k%n;
        reverse(nums, 0, n-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, n-1);
       System.out.println(reverse(nums, k, n));





    }
    

    
}
