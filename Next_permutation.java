// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :No(Glassdoor question )
// Any problem you faced while coding this :
//https://www.glassdoor.co.in/Interview/Write-a-program-in-Python-to-calculate-tax-if-Salary-and-Tax-Brackets-are-given-as-list-in-the-form-10000-3-20000-QTN_2565898.htm


class Solution {
    public void nextPermutation(int[] nums) {
        if(nums == null || nums.length == 0) return;
        int len = nums.length;
        int peak_index = -1;
        int swap_next_index=0, swap_index=0;
        //Find dip
        for(int i = len - 1; i > 0 ; i--){
            if(nums[i-1] < nums[i]){
                peak_index = i;
                swap_index = i-1;
                break;
            }
        }
        if(peak_index == -1)
        {reverse(nums,0,len);
            return;}
        //Find Swap Element
        for(int i= peak_index ; i < len ; i++ ){
            if(nums[i] > nums[swap_index])
                swap_next_index = i;
        }
        //Swap
        swap(nums,swap_index, swap_next_index);
        
        //Reverse
        reverse(nums, peak_index,len);
    }
    private void swap(int[] nums, int i, int j){
        if(nums[i] != nums[j]){
            nums[i] = nums[i] + nums[j];
            nums[j] = nums[i] - nums[j];
            nums[i] = nums[i] - nums[j];
    }
}
    private void reverse(int[] nums, int start, int end){
        end--;
        while(start<end){
            swap(nums, start , end );
            start++;
            end--;
        }
    }
}            
           