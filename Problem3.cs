// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

/*
I find the first breach in the array - first position where nums[i] < nums[i+1]. If i = -1 i.e the number is sorted in descending order(already the greatest permutation that can be formed) I simply
reverse the entire number. If I found a breach, I find the next greater element than that particular element which caused the breach and swap the two numbers. At the end, I reverse the portion of 
numbers that are sorted in descending order.
*/

public class Solution {
    public void NextPermutation(int[] nums) {
        int i = nums.Length - 2;

        //Find breach
        while(i>=0 && nums[i] >= nums[i+1])
        {
            i--;
        }

        if(i != -1)
        {
            int j = nums.Length -1;
            // Find next greater element
            while(j>i)
            {
                if(nums[j] > nums[i])
                {
                    break;
                }
                j--;
            }

            // Swap the two elements
            Swap(nums, i, j);
        }

        Reverse(nums, i + 1);
    }

    public void Swap(int[] nums, int i, int j)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void Reverse(int[] nums, int start)
    {
        int end = nums.Length - 1;
        while(start<end)
        {
            Swap(nums, start, end);
            start++;
            end--;
        }
    }
}