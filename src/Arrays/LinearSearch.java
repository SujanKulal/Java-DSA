package Arrays;

public class LinearSearch {
    static int linearSearch(int[] arr, int key){
        for(int i = 0; i < arr.length;i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,4,5,2};
        int key = 5;
        System.out.println(linearSearch(arr, key));
    }
}
