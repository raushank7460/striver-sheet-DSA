package Day1;

public class largestPrimeNumber {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
       // System.out.println(isPrime(15));
       int num=100;
      int max=-1;

       for(int i=0;i<=num;i++ ){
        if(isPrime(i)){
            max=i;
        }
       }
       System.out.println(max);

    }

}
