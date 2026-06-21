package arrays;

import java.util.Scanner;

public class secLargest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("size:");
        int n=sc.nextInt();
        System.out.print("enter ele:");
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        int secMax=-1;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                secMax=max;
                max=arr[i];
            }else if(arr[i]>secMax && arr[i]!=max){
                secMax=arr[i];
            }
        }
        System.out.println(secMax);

    }
    
}
