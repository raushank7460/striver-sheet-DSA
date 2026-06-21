package string;

import java.util.Scanner;

public class palindromeString {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter str:");
       String str=sc.nextLine();
       int i=0;
       int j=str.length()-1;
       while(i<j){
        if(str.charAt(i)!=str.charAt(j)){
            System.out.println("no");
            return;
        }
        i++;
        j--;
       }
       System.out.println("Yes");


    }
}
