import java.util.Scanner;

public class PrimeFactors {
   /* //O(n), for prime no.s inner loop is not being executed
    static void primeFactors(int n){
        int i = 2;
        while(n>1) {
            while (n % i == 0) {
                System.out.print(i +" ");
                n /= i;
            }
            i++;
        }
    }
    */

    //O(rt.n(logn))
    static void primeFactors(int n){
        int i = 2;
        while(i*i<=n) {
            while (n % i == 0) {
                System.out.print(i +" ");
                n /= i;
            }
            i++;
        }
        if(n>1){
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        primeFactors(n);
    }
}
