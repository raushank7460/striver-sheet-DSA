package Day1;

public class gcdOfTwoNumber {
    // public static void main(String[] args) {
    //     int num1=12;
    //     int num2=18;
    //     while(num2!=0){
    //         int temp=num2;
    //         num2=num1%num2;
    //         num1=temp;
    //     }
    //     System.out.println(num1);
    // }
    public static void main(String[] args) {
        System.out.println(gcd(12,18));
    }
    public static int gcd(int a,int b){
        if(b==0){
            return a;
        }
       
        return gcd(b,a%b);
        

    }
    
   
    
}
