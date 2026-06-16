package Day1;

public class countPrimeInRange {
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
        int range=100;
        int count=0;
        for(int i=0;i<=range;i++){
            if(isPrime(i)){
                count++;
            }
        }
        System.out.println(count);
        
    }
    
}
