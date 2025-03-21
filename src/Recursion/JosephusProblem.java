package Recursion;

public class JosephusProblem {
    static int jos(int n, int k){
        if(n ==1) return 0;
        return (jos(n-1,k) + k) % n;
    }

    public static void main(String[] args) {
        System.out.println(jos(7,3));
    }
}
