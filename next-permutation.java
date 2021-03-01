//Time Complexity: o(n)
//Space Complexity: o(1)
//Expln:  First find the breach from the back where the value is less than the right value. 
//If there is a breach that means there is a next permutation possible as there are big elements.
//swap the breached element with the next greatest element and. Reverse the values from the next of the breach
// as it is in ascending order from back until breach.
class Solution {
    public void nextPermutation(int[] nums) {
        if(nums.length == 0) return;
        int prev =0; int breach = 0; boolean b = false;
        for(int i = nums.length -1 ; i >= 0; i--)
        {
            if (nums[i] >= prev){
                prev = nums[i];
                continue;
            }
            else{
                breach = i;
                b = true;
                break;
            }
        }
        findGreater(nums, breach);
        if(b == true)
            reverse(nums, breach + 1, nums.length -1);
        else
            reverse(nums, 0, nums.length -1);
        return;
    }
    private void reverse(int[] nums, int l, int r)
    {
        while(l<=r){
            swap(nums, l, r);
            l++; r--;
        }

    }
    private void findGreater(int [] nums, int breach)
    {
        for(int i = nums.length  -1 ; i > breach; i--)
        {
            if(nums[i] > nums[breach])
            {
                swap(nums, breach, i);
                break;
            }
        }
    }
    private void swap(int[] nums, int l, int r)
    {
        int temp  = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
    }
    
}