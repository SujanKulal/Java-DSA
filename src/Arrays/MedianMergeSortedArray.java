package Arrays;

//O(m+n)
public class MedianMergeSortedArray {
    static float findMedian(int[] a1, int[] a2){
        int i=0,j=0,k=0;
        int [] res = new int[a1.length + a2.length];

        while (i<a1.length && j<a2.length && k<=(res.length/2)){
            if(a1[i] < a2[j]){
                res[k] =a1[i];
                i++;
                 k++;
            }else {
                res[k] =a2[j];
                j++;
                k++;
            }
        }
        while (i<a1.length && k<=(res.length/2)){
            res[k] =a1[i];
            i++;
            k++;
        }

        while (j<a2.length && k<=(res.length/2)){
            res[k] =a2[j];
            j++;
            k++;
        }

        if(res.length%2==0){
            int mid = res.length/2;
            return (float)(res[mid] + res[mid -1])/2;
        }else {
            int mid = res.length/2;
            return res[mid];
        }

    }
    public static void main(String[] args) {

        int a1[] = {1,3,8,17};
        int a2[]  = {5,6,7,19,21,25};
        System.out.println(findMedian(a1,a2));
    }
}
