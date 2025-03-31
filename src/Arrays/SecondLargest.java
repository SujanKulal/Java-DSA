package Arrays;

public class SecondLargest {
    static int secondLargest(int[] a){
        int fL = Integer.MIN_VALUE;
        int sL = Integer.MIN_VALUE;

        for(int num: a){
            if(num>fL){
                sL = fL;
                fL = num;
            }else if(num>sL && num != fL){
                sL = num;
            }
        }
        return (sL ==Integer.MIN_VALUE) ? -1 : sL;
    }
    public static void main(String[] args) {
        int[] a = {1,23,3,4,55,55};
        System.out.println(secondLargest(a));
    }
}
