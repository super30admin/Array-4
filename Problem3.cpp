/* Problem Statement:

VERIFIED ON LEETCODE PLATFORM 
31. Next Permutation
Medium

Implement next permutation, which rearranges numbers into the lexicographically next greater permutation of numbers.

If such arrangement is not possible, it must rearrange it as the lowest possible order (ie, sorted in ascending order).

The replacement must be in-place and use only constant extra memory.

Here are some examples. Inputs are in the left-hand column and its corresponding outputs are in the right-hand column.

1,2,3 → 1,3,2
3,2,1 → 1,2,3
1,1,5 → 1,5,1

 * Solution 1: using Mathematics. PLot the value on a graph to visualize it   
   Time Complexity : O(n)
 * Space complexity :O(1)
 */

class Solution {
public:
    /* Reverse an array helper function */
    void reverse(int start, int end, vector<int>& nums) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }      
    }
    
    void nextPermutation(vector<int>& nums) {
        
        int idx = 0;
        int idx2 = 0;
        int dip_point = 0; /* The point starting from the end where the number at dip_point is smaller than the element at next index */
        int next_greater_point = 0; /* The index at which value is just greater than the value at dip_point */
        bool found_dip = false; /* Did we find a dip ? Imagine a plotting of the values on a chart to visualize it */
        int len = nums.size();
        if (len == 0) {
            return;
        }
        
        /* Start from the 2nd last element so that we can compare it */
        for (idx = len - 2; idx>=0; idx--) {
            if (nums[idx] < nums[idx+1]) {
                found_dip = true;
                break;
            }
        }
        /* If we didnt find a dip, the question says us to return the sorted array which will anyways be done at the end of the if condition */
        if (found_dip == true) {
            /* update the indexes */
            dip_point = idx;
            next_greater_point = idx + 1;
            
            /* Time to find the next greater element */
            for (idx2 = idx + 2; idx2 < len;idx2++) {
                /* The next greater should lie between dip point and the next item found in the array */
                if (nums[dip_point] < nums[idx2] && nums[next_greater_point] >= nums[idx2]) {
                    next_greater_point = idx2;        
                }
            }
            /* Swap the values at the points ... */
            int temp = nums[dip_point];
            nums[dip_point] = nums[next_greater_point];
            nums[next_greater_point] = temp;       
        }
        /* Reverse the left over array , we will get the next element for this array */
        reverse(idx+1, len - 1, nums); 
    }
};
/* Execute on leetcode platform */


