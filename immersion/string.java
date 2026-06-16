// Ques:Substring of size three with distinct characters 

package immersion;

import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int count=0;
        for(int i=0;i<=s.length()-3;i++){
            char a=s.charAt(i);
            char b=s.charAt(i-1);
            char c=s.charAt(i-2);
            if(a!=b && b!=c && a!=c){
                count++;
            }
            System.out.println(count);
        }
    }
    
}
