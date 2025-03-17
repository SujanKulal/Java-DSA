package Recursion;

public class FirstN {
    static void PrintN(int n){
        if(n==0) return;
        PrintN(n-1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        PrintN(5 );
    }
}
