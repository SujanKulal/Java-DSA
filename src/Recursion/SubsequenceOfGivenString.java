package Recursion;

import java.util.Scanner;

public class SubsequenceOfGivenString {
    static void gss(String s, String ans){
        if(s.length() == 0){
            System.out.println(ans);
            return;
        }
        //pick
        gss(s.substring(1), ans+s.charAt(0));
        //not pick
        gss(s.substring(1), ans);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s = sc.next();

        gss(s,"");
    }
}
