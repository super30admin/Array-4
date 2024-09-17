// Time Complexity: O(nlogn + n) -> O(nlogn)
// Space Complexity: O(1)
public class ArrayPartitionI {
    public int arrayPairSum(int[] nums) {
        if(nums == null || nums.length == 0)
            return 0;
        
        // Sort the numbers in asc order
        Arrays.sort(nums);
        
        int sum = 0;
        // pick alternate number as we want min of each pair
        for(int i = 0 ; i < nums.length; i = i+2)
        {
            sum += nums[i];
        }
        return sum;
    }
}
