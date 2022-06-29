//Time Complexity: O(n)
//Space Complexity : O(1)
class Solution {
    public void nextPermutation(int[] nums) {
        if(nums == null) return;
        int n = nums.length;
        //finding breach
        int i = n-2;
        while(i >= 0 && nums[i] >= nums[i+1]){
            i--;
        }
        //breached element
        if(i >= 0){
            int j = n-1;
            while(nums[i] >= nums[j]){
                j--;
            }
            swap(nums, i, j);
        }
        //reverse from breached index i+1 to last
        reverse(nums,i+1,n-1);
    }
        
    private void reverse(int[] nums, int l, int r){
        //reversing from given two numbers
        while(l < r){
            swap(nums, l, r);
            l++;r--;
        }
    }
    
    private void swap(int[] nums, int i, int j){
        //swaping from given two numbers
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}