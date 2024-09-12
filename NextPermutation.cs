
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// 1) Start from end, compre two elements
//     a. If right elment is bigger than left element
//     b. Then we know, if put one bigger number on left element, then we can get next greater bigger number
//     c. So we take this left element and start comparing with end index
//     d. Keep decementing index, until we find bigger number on right from left element, once we find it, swap them
//     e. This result if still not next bigger number, to get next bigger number
//         i. We will reverse the array after the left element
//         ii. Now we have next bigger number

public void NextPermutation(int[] nums) {
    if(nums == null || nums.Length == 0)
        return;
    
    int n = nums.Length;
    int left = 0;
    int i = n-2;
    //Step1: Find the breaching point where right element is bigger than left element
    //Then we know, if put one bigger number on left element, then we can get next greater bigger number
    while(i >= 0 && nums[i] >= nums[i+1])
    {
        i--;
    }
    //Step2:So we take this left element found in step 1 and start comparing with end index and keep decrementing
    int j = n-1;
    if(i >= 0){
        while(j >= 0 && nums[j] <= nums[i])
        {
            j--;
        }
        swap(nums, i, j);
    }

    //step 3: We will reverse the array after the left element
    reverse(nums, i+1, n-1);
}

private void swap(int[] nums, int i, int j)
{
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
}

private void reverse(int[] nums, int l, int r)
{
    while(l <= r)
    {
        swap(nums, l, r);
        l++; 
        r--;
    }
}