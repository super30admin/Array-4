// Time Complexity : O(nlogn)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

// Sort the array: The code sorts the array in ascending order.
//Sum every second element: It then iterates through the array, summing every second element starting from the first element.
//Return the sum: Finally, it returns the total sum of these elements.

class Solution {
    public int arrayPairSum(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        Arrays.sort(nums);
        int total = 0;
        for(int i = 0 ; i< nums.length ; i = i+2){
            total = total + nums[i];
        }

        return total;
    }
}