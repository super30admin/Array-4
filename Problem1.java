//Time Complexity: O(n*log(n)); where n is the length of nums array
//Space Complexity: O(1)
//Code run successfully on LeetCode.

public class Problem1 {

    public int arrayPairSum(int[] nums) {
        
        if(nums == null|| nums.length == 0)
            return -1;
        
        Arrays.sort(nums);
        int n = nums.length;
        int result = 0;
        
        for(int i =0; i <n; i=i+2)
        {
            result += nums[i];
        }
        return result;
    }
}
