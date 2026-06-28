package arrays;

public class leetcode136 {
    public static void main(String[] args) {
        int []nums = {2,2,1};
        int ans=0;
        for(int x:nums){
            ans^=x;
        }
        System.out.println(ans);
    }
    
}
