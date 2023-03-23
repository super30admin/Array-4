// Sorting
public class ArrayPartition {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int res = 0;
        for(int i=0;i<nums.length;i+=2){
            res +=nums[i];
        }
        return res;
    }
}

// Time Complexity - O(nlogn)
// Space Complexity - O(1)
