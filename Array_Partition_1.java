// Time Complexity : O(nlogn) for sorting + O(n/2) for traversing once through the array. = O(nlogn)
// Space Complexity : O(1), no extra space is used
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        int count = 0;
        while(i<nums.length){
//Every first element i taken in pair
            count+=nums[i];
            i=i+2;
        }
        return count;
    }
}