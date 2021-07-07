# Time complexity:O(n)
# Space complexity: 0(1)
# Did code run successfully on leetcode: yes
# Any problem you faced: No






class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for(int i = 0; i < nums.length; i+=2){
            sum += nums[i];
        }

        return sum;
    }
}