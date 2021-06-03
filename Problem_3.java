//Time Complexity:O(n)
//Space Complexity:O(n)
class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        //find the mismatch
        int t=-1;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]) {
                t=i;
                break;
            }
        }
        //find the greater element then pivot starting from right
        if(t!=-1){
            for(int i=n-1;i>=0;i--){
                if(nums[i]>nums[t]){
                    swap(nums, i, t);
                    break;
                }
            }
        }
        //we need to reverse the part of array after the pivot
        reverse(nums, t+1, n-1);
    }
    private void swap(int[] nums, int i, int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    private void reverse(int[] nums, int i, int j){
        while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }    
    }
}