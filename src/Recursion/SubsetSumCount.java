package Recursion;

public class SubsetSumCount {
    static int CountSubSets(int[] arr, int sum, int i){
        if(sum == 0){
            return 1;
        }
        if(sum < 0){
            return 0;
        }
        if(i == arr.length){
            return 0;
        }
        return CountSubSets(arr,sum-arr[i],i+1) + CountSubSets(arr,sum,i+1);
    }

    public static void main(String[] args) {
        int[] arr ={20,15,10,5};
        System.out.println(CountSubSets(arr,30,0));
    }
}
