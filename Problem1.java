/* 
    LC - 561. Array Partition
    TC -  O(n log n)
    SC - O(1)
    Approach - 
        sort the array so that even indices have the smallest of the pair
        calculate the sum for even index
*/

class Solution {
    public int arrayPairSum(int[] nums) {
        if(nums == null || nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        int sum = 0;
        for(int i=0; i<nums.length; i++) {
            if(i % 2 == 0) {
                sum = sum + nums[i];
            }
        }
        return sum;
    }
}