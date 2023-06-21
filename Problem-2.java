/*
It is a kind of window/ two pointer solution, where we explore adding an element into the window and see if we can get max while the element in the window or without the window,
if not, then we will start a new window from that element
T: O(n)
S: O(1)

*/
class Solution {
    public int maxSubArray(int[] nums) {

        int ptr =0;
        int prev =0;
        int max = Integer.MIN_VALUE;

        while(ptr<nums.length){
            // check if ptr is better  or ptr +prev
            int calc = prev + nums[ptr];
            if(calc > nums[ptr]){
                prev = calc;
            }
            else{
                prev = nums[ptr];
            }
            max = Math.max(max, prev);
            ptr++;
        }

        return max;
        
    }
}