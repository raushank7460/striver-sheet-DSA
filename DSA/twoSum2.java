package DSA;

import java.util.Scanner;

public class twoSum2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("size:");
        int n=sc.nextInt();
        System.out.println("enter ele:");
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("target:");
        int target=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println(i+""+j);
                    return;
                    

                }
            }
        }

    }

    
}
