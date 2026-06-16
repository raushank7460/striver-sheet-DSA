package Day1;

public class sumOfPrime {
    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        //System.out.println(isPrime(15));
        int range=100;
        int sum=0;
        for(int i=2;i<=100;i++){
            if(isPrime(i)){
                sum=sum+i;
                
            }
        }
        System.out.println(sum);
        
    }
    
}
