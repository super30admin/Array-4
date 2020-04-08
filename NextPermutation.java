Time Complexity = O(n)
Space Complexity = O(1)

class Solution {
    public void nextPermutation(int[] nums) {
        int k = nums.length - 2;
        
        while(k >= 0 && nums[k] >= nums[k+1]){
            k--;
        }
        
        if(k == -1){
            reverse(nums,0,nums.length-1);
        }
        
        for(int low = nums.length - 1; low > k; low--){
            if(nums[low] > nums[k]){
                int temp = nums[low];
                nums[low] = nums[k];
                nums[k] = temp;
                break;
            }
        }
        reverse(nums,k+1,nums.length - 1);
    }
    
    private void reverse(int[] nums, int start, int end){
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}