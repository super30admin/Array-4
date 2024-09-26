import java.util.Arrays;


// TC: O(nlogn)
// SC: O(nlogn) for recursion stack of sort function.
class ArrayPartition {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for(int i=0;i<nums.length;i = i+2) {
            sum += nums[i];
        }
        return sum;
    }
}