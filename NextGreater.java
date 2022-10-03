//TC : O(n)
//SC : O(1)

class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int i=n-2;
        while(i>=0 && nums[i] >= nums[i+1]){
            i--;
        }
        if(i != -1){
            int j=n-1;
            while(nums[i] >= nums[j]){
                j--;
            }
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        reverse(nums,i+1,n-1);
    }
    
    private void reverse(int[] nums,int i,int j){
        while(i<j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;j--;
        }
    }
}
