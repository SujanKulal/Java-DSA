package Arrays;
import java.util.Arrays;

public class FirstLastIndex {
    static int[] searchRange(int[] nums, int target){
        int s = 0, e=nums.length-1,mid=0;
        int res[] = {-1,-1};
        while (s<=e){
            mid = s+ (e-s) /2;
            if(target == nums[mid]){
                res[0] = mid;
                e = mid-1;
            } else if (target>nums[mid]) {
               s=mid+1;
            }else {
                e = mid -1;
            }
        }
         s = 0;
         e=nums.length-1;

        while (s<=e){
            mid = s+ (e-s) /2;
            if(target == nums[mid]){
                res[1] = mid;
                s = mid+1;
            } else if (target>nums[mid]) {
                s=mid+1;
            }else {
                e = mid -1;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int nums[] = {3,4,4,4,4,4,4,6};
        int target = 4;
        int[] result = searchRange(nums,target);
        System.out.println(Arrays.toString(result));
    }
}
