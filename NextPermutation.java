//TC: O(n)
//SC: O(1)
class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        
        //find the breach
        int j = n-2;
        while(j >= 0 && nums[j] >= nums[j+1]){
            j--;
        }
        //swap the number with the first greater element if j >= 0
        int i = n-1;
        if(j >= 0){
           while(nums[i] <= nums[j]){
                i--;
            }
            swap(nums, i, j);
        }
        
        //reverse the array from j+1 to n-1
        reverse(nums, j+1, n-1);
    }
    
    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    private void reverse(int[] nums, int l, int r){
        while(l <= r){
            swap(nums, l, r);
            l++;
            r--;
        }
    }
}
