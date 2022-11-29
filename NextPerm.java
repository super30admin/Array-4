// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach :
/*
 * 1 - First we traverse from the last index upto the point where we find a breach i.e. any number that breaks the
 * ascending order.
 * 2 - We then traverse from the last index until we find an integer which is greater than the breaching number
 * 3 - We swap these two digits with each other and we reverse a portion of the array which is after the breaching integer.
 */

public class NextPerm {
    public void nextPermutation(int[] nums) {
        if(nums.length == 0 || nums == null)
        {
            return;
        }
        
        int n = nums.length;
        int i = n - 2;
        int j = n -1;
        
        
        //find the breach
        while(i >=0 && nums[i] >= nums[i + 1])
        {
            i--;
        }
        
        //swap the digit
        if(i >= 0)
        {
            while(nums[j] <= nums[i])
            {
                j--;
            }
            swap(nums,i,j);
        }
        
        //reverse the later half of the array
        reverse(nums,i+1,n-1);
    }
    
    public void reverse(int[] nums, int l, int r)
    {
        while(l < r)
        {
            swap(nums,l,r);
            l++;
            r--;
        }
    }
    
    public void swap(int[] nums, int i, int j)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
