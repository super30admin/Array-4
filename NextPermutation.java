// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


/*
 * first iterate from back and find and when the element where there is a dip the number range
 * we then swap that element with the lowest greater number than that element and reverse the right part of the array after the change element so we can get the next highest number
 */
class Solution {
    public void nextPermutation(int[] nums) {
        int change = -1;
        for(int i= nums.length - 2; i >= 0; i--){
            if(nums[i] < nums[i+ 1]){
                change = i;
                break;
            }
        }
        if(change > -1){
            for(int i= nums.length -1; i> change; i--){
                if(nums[ change] < nums[i]){
                    int temp = nums[i];
                    nums[i] = nums[change];
                    nums[change] = temp;
                    break;
                }
            }
        }
        
        System.out.println(change + "  " + nums);
        int s = change + 1;
        int e = nums.length - 1;
        while(s < e){
            int temp = nums[s];
            nums[s] = nums[e];
            nums[e] = temp;
            s++;
            e--;
        }

    }
}