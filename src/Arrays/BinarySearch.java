package Arrays;

//0(logn)
public class BinarySearch {

    static int binarySearch(int[] a, int key){
        int start =0, end = a.length-1, mid =0;
        while (start<=end){
            mid = (end - start) + start /2;
            if(key == a[mid]){
                return mid;
            }else if(key<a[mid]){
                start = start;
                end = mid -1;
            }else {
                start = mid +1;
                end = end;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] a = {1,4,6,8,10};
        int key = 8;
        System.out.println(binarySearch(a,key));
    }
}
