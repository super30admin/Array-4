import java.util.Arrays;

public class Array_Partition_I {
	//Approach: If we sort the elements, then we can find the pairs we need, and choose the first element of the pair without wasting the bigger element
	//Intuition is to not waste the biggest element while forming pair
	public int arrayPairSum(int[] nums) {
        if(nums == null || nums.length == 0)
            return 0;
        Arrays.sort(nums);
        int sum = 0;
        for(int i=0; i < nums.length; i=i+2)
        {
            //minimum elem will always be at ith position since we are skipping max elemtn of the pair
            sum += nums[i];
        }
        return sum;
    }
}
//Time Complexity : O(n log n)
//Space Complexity : O(1)
//Did this code successfully run on Leetcode :
//Any problem you faced while coding this :