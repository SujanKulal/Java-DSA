package Maths;

import java.util.Scanner;
// 0(root.n)
public class PrimeNumber {
    static boolean prime(int n){
        if(n<= 1) return false;
        for(int i = 2; i*i<n; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(prime(n)){
            System.out.println("Prime");
        } else System.out.println("Not Primme");
    }
}
