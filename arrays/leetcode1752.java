package arrays;
// Given an array nums, return true if the array was originally sorted in non-decreasing order, then rotated some number of positions (including zero). Otherwise, return false.

// There may be duplicates in the original array.

// Note: An array A rotated by x positions results in an array B of the same length such that B[i] == A[(i+x) % A.length] for every valid index i.
 public class leetcode1752 {
    public static void main(String[] args) {
        int[]arr={5,4,1,2,3};
        int n=arr.length;
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]>arr[(i+1)%n]){
                count++;
            }

        }
        System.out.println(count<=1);
    
    }
    
}
