package Arrays;

public class CountSmallAndEqualElements {
    static int count(int[] a, int key){
        int s = 0, e = a.length-1, mid =0;
        while (s<=e){
            mid = s+(e-s) /2;
            if(key == a[mid]){
                while (mid+1 <a.length && a[mid+1] == key){
                    mid++;
                }
                break;
            } else if (key<a[mid]) {
                e = mid-1;
            }else {
                s=mid+1;
            }
        }
        if(a[mid]>key){
            return mid;
        }else return mid+1;
    }
    public static void main(String[] args) {
        int a [] = {2,6,12,24,26,26,28,30};
        int key = 25;
        System.out.println(count(a,key));
    }
}
