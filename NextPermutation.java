// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public void nextPermutation(int[] nums) {
        int swapLocation=-1;
        for(int i=nums.length-1;i>0;i--){
            if(nums[i]>nums[i-1]){
                swapLocation=i-1;
                break;
            }
        }
        
        if(swapLocation==-1){
            reverse(nums,0,nums.length-1);
            return;
        }
        
        int smallest=Integer.MAX_VALUE;
        int minLocation=0;
        for(int i=swapLocation+1;i<nums.length;i++){
            if(nums[i]>nums[swapLocation] && nums[i]<=smallest){
                smallest=nums[i];
                minLocation=i;
            }
        }
        
        int temp=nums[swapLocation];
        nums[swapLocation]=nums[minLocation];
        nums[minLocation]=temp;
        
        reverse(nums,swapLocation+1,nums.length-1);
        
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