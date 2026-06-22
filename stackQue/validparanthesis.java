package stackQue;

import java.util.Scanner;
import java.util.Stack;

public class validparanthesis {
    public static boolean isValid(String s){
        Stack<Character>st=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='('||ch=='{'||ch=='['){
                st.push(ch);
            }else{
                if(st.isEmpty()){
                    return false;
                }
                char top=st.pop();
                if((ch==')'&& top!='(')|| (ch=='}'&& top!='{')||(ch==']'&& top!='[')){
                    return false;
                }

            }
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(isValid(s));

    }
}