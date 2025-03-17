package bitManipulation;

import java.util.Scanner;

public class Bi2De_De2Bi {
    static String De2Bi(int n){
        String b = "";
        while (n>=1) {
            int x = n % 2;
            n = n / 2;
            b = x + b;
        }
        return b;
    }

    static int Bi2De(String b){
        int powOf2 = 1;
        int result = 0;

        for(int i=b.length()-1;i>=0;i--){
            if(b.charAt(i) == '1'){
                result = result + powOf2;
            }
            powOf2 = powOf2*2;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String b = De2Bi(n);
        System.out.println(b);
        System.out.println(Bi2De(b));
    }
}
