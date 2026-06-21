package string;

import java.util.HashSet;
import java.util.Scanner;

public class abc {
    // public static void main(String[] args) {
    //     String str="abcabc";
    //     int count=0;
    //     for(int i=0;i<str.length();i++){
    //        char ch=str.charAt(i);
    //         if(str.indexOf(ch)==i){
    //             count++;
    //         }
    //     }
    //     System.out.println(count);
    // }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter strings:");
        String str=sc.nextLine();
        int count=0;
        HashSet<Character>sb=new HashSet<>();
        for(int i=0;i<str.length();i++){
            sb.add(str.charAt(i));
        }
        System.out.println(sb.size());

    }
    
}
