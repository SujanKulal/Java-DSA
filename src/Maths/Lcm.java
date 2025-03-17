package Maths;

import java.util.Scanner;
// Brute force O(a*b - min(a,b))

public class Lcm {
    //Brute Force
    /*
    static int findLcm(int a,int b){
        int res = Math.max(a,b);
        while (true){
            if(res%a ==0 && res % b ==0){
                break;
            }
            res ++;
        }
        return res;
    }
*/
    //Best O(log(min(a,b)))
    static int findLcmm(int a,int b) {
        return (a * b) / euclidGcd(a, b);
    }

static int euclidGcd(int a, int b){
    while(a!= 0 && b!=0){
        if(a>b){
            a = a%b;
        } else b = b%a;
    }
    if(a!=0) {
        return a;
    }
    else return b;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(findLcmm(a,b));
    }
}
