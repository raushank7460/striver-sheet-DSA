package arrays;

public class moveZero {
    public static void main(String[] args) {
        int[]nums = {0,1,0,3,12};
        int n=nums.length;
        int i=0;
        for(int j=0;j<n;j++){
            if(nums[j]!=0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
            }
        }
        for(int ele:nums){
            System.out.print(ele+" ");
        }
    }
    
}
