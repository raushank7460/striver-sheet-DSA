package backTracking;

import java.util.*;

public class printPermutation {
    public static void main(String[] args) {
        String st="ABC";
        List<String>l=new ArrayList<>();
       print(st,"",l);
       System.out.println(l);
       

    }
    public static void print(String st,String s, List<String>l){
       
        if(st.isEmpty()){
            l.add(s);
            
            return;
        }
        for(int i=0;i<st.length();i++){
            char ch=st.charAt(i);
            String left=st.substring(0,i);
            String right=st.substring(i+1);
            String rem=left+right;
            print(rem,s+ch,l);
        }

    }
    
}
