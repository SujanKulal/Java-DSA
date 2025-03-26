package Recursion;

import java.util.Scanner;

public class GenerateBalancedParenthesis {
    static void balPar(char[] ar, int i, int n, int o, int c){
        if(i==ar.length){
            System.out.println(ar);
        }
        if(o<n){
            ar[i] = '(';
            balPar(ar,i+1,n,o+1,c);
        }
        if(c<o){
            ar[i] = ')';
            balPar(ar,i+1,n,o,c+1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] ar = new char [n*2];
        balPar(ar,0,n,0,0);
    }
}
