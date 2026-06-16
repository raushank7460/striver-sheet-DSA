package recursion;

public class factorial {
    public static int fact(int n){
        if(n==0 || n==1){
            return n;
        }
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        System.out.println(fact(5));
       
        

    }
    
}
//1+2+3+4+