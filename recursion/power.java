package recursion;

public class power {
    public static int powers(int a,int b){
        if(b==0){
            return 1;
        }
        return a*powers(a, b-1);
    }
    public static void main(String[] args) {
        System.out.println(powers(2, 3));

        
    }
    
}
