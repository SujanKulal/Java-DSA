package Recursion;

public class LuckyNumber {
    static boolean isLuckuNumber(int n, int counter){
        if(n<counter){
            return true;
        }
        if(n%counter == 0){
            return false;
        }
        return isLuckuNumber(n - (n/counter), counter+1);
    }

    public static void main(String[] args) {
        System.out.println(isLuckuNumber(13,2));
    }
}
