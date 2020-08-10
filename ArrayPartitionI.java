/*
Approach 
sort the numbers and then alternate numbers sum is the result
Leetcode executed
*/
class Solution {
    public int arrayPairSum(int[] nums) {
        int result = 0;
        Arrays.sort(nums);
        for(int i=0; i < nums.length;i=i+2){
            result+= nums[i];
        }
        return result;
    }
}

/*
Time complexity: O(nlogn)
Space complexity : O(1)
*/