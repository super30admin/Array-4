//Time Complexity: O(nlogn)
//Space Complexity: O(1)
//Did it run on leetcode: yes
/** Approach: Sort the array and pick the alternate indices
    this way we stop skipping the largers value **/

class Solution {
    public int arrayPairSum(int[] nums) {
        
        Arrays.sort(nums);
        int total = 0;
        for(int i=0; i<nums.length; i += 2){
            total += nums[i];
        }
        
        return total;
    }
}
