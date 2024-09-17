// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
// iterate from end and find first element less than previous element.
// iterate from that element to end and find an element just greater than that element, else iterate till end.
// swap both elements. sort subarray between both elements.

class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n-2;
        while(i>=0){
            if(nums[i] < nums[i+1])break;
            i--;
        }
        if(i < 0) sortSubarray(nums,0,n-1);
        else {
            int j = i+1;
            while(j<n && nums[j]>nums[i]) j++;
            j--;
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j = n-1;
            sortSubarray(nums,i,j);
        }
        return;
    }
    private void sortSubarray(int[] nums, int i, int j){
        while(i<j){
                int temp1 = nums[i];
                nums[i] = nums[j];
                nums[j] = temp1;
                i++;j--;
            }
    }
}