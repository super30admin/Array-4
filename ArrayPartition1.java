// TC: O(N)
// SC: O(1)
import java.util.Arrays;

public class ArrayPartition1 {
    public int arrayPairSum(int[] nums) {
        int sum = 0;
        // Sorting the array
        Arrays.sort(nums);
        // Checking 2 elements and getting the min of 2 and sliding the window to next two
        for(int i=0;i<nums.length-1; i=i+2){
            sum += Math.min(nums[i],nums[i+1]);
        }        
        return sum;
    }
}