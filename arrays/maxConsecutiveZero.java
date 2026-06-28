package arrays;

public class maxConsecutiveZero {
    public static void main(String[] args) {
        int[]nums = {1,1,0,1,1,1};
        System.out.println(maxZero(nums));


    }
    public static int maxZero(int []nums){
      //  int n=nums.length;
        int count=0;
        int max=0;
        for(int num:nums){
            if(num==0){
                count++;
                max=Math.max(max, count);
            }
        }
        return max;
    }
    
}
