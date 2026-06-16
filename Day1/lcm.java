package Day1;

public class lcm {

    public static void main(String[] args) {

        System.out.println("GCD = " + gcd(12, 18));
        System.out.println("LCM = " + lcms(12, 18));

    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static int lcms(int a, int b) {
        return (a * b) / gcd(a, b);
    }
}

// HCF → Biggest number that divides both

// LCM → Smallest number divisible by both

// Formula:
// HCF × LCM = a × b

// GCD/HCF:
// gcd(a,b) = gcd(b,a%b)

// LCM:
// (a*b)/gcd(a,b)
