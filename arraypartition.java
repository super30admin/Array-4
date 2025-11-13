import java.util.Arrays;

public class arraypartition {

    // Time Complexity: O(nlogn)
    // Space Complexity: O(1)
//We first sort the array so the smaller elements are grouped with the next bigger ones.
//Then, we add every alternate element (starting from index 0) since it's the min in each pair.
//This ensures the sum of mins across all pairs is maximized as required.
    public int arrayPairSum(int[] nums){
        int n = nums.length;
        Arrays.sort(nums);

        int result = 0;
        for(int i=0;i<n;i+=2)
        {
            result += nums[i]; 
        }
        return result;
    }
}
