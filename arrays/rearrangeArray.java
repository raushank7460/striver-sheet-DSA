package arrays;



public class rearrangeArray {
    public static void main(String[] args) {
        int [] nums = {3,1,-2,-5,2,-4};
        int []ans=new int[nums.length];
        int posIndex=0;
        int negIndex=1;
        for(int num:nums){
            if(num>0){
                ans[posIndex]=num;
                posIndex+=2;
            }else{
                ans[negIndex]=num;
                negIndex+=2;
            }
        }
        for(int x:ans){
            System.out.print(x+" ");
        }
        
        
    }
    
}
