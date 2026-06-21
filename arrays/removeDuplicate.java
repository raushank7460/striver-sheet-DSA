package arrays;

import immersion.string;

public class removeDuplicate {
    public static void main(String[] args) {
        int[]nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));  
    }
    public static int removeDuplicates(int[]nums){
        int n=nums.length;
        int i=0;
        for(int j=1;j<n;j++){
            if(nums[j]!=nums[i]){
                i++;
                nums[i]=nums[j];
            }
        }
       return i+1;
    }
    
}
