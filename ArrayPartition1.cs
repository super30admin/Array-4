//Iime: O(n log n)
//Space: O(1)
public class Solution {
    public int ArrayPairSum(int[] nums) {
        Array.Sort(nums);
        int sum = 0;
        for(int i = 0; i < nums.Length - 1; i = i+2) {
            sum += Math.Min(nums[i], nums[i+1]);
        }
        return sum;
    }       
}