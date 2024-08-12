public class lec {
    // public static boolean prime(int n) {
    // boolean isPrime = true;
    // for (int i = 2; i <= n - 1; i++) {
    // if (n % i == 0) {
    // isPrime = false;

    // }
    // }
    // return isPrime;
    // }

    // public static void main(String args[]) {
    // System.out.println(prime(8));
    // }
}

// optimised method for prime n.
public static boolean prime(int n) {

    if(n ==2){
        return true;
    }
    for(int i =2; i<=Math.Sqrt(n); i++){
        if(n%i==0){
            return false;
        }
        return true;
    }
    public static void main(String args[]){
        System.out.println(prime(9));

    }
}