package Arrays;

public class SpanOfArray {
    static int span(int[] a){
        if(a.length == 0){
            return -1;
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int ele: a){
            if(ele > max){
                max = ele;
            }
            if (ele<min){
                min = ele;
            }
        }
        return max - min;
    }
    public static void main(String[] args) {
        int[] a = {6,8,1,5,22,3};
        System.out.println(span(a));
    }
}
