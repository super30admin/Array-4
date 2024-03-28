import java.util.Arrays;

public class Array_Partition {
    public int arrayPairSum(int[] nums) {
        //TC: O(nlogn)
        //SC: O(1)
        Arrays.sort(nums);
        int maxsum = 0;
        for(int i = 1; i <= nums.length; i+=2){
            maxsum += Math.min(nums[i-1], nums[i]);
        }
        return maxsum;
    }
}
