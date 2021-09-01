//TC: O(N)
//SC: O(1)
//where N is the length of nums array
class Solution {
    public void nextPermutation(int[] nums) {
        if(nums==null)
            return;
        int n=nums.length,i=n-2;
        while(i>=0 && nums[i]>=nums[i+1]){
            i--;
        }
        if(i>=0){
            int j=n-1;
            while(nums[i]>=nums[j])
                j--;
            //swap i and j
            swap(nums,i,j);
        }
        //reverse range
        reverse(nums,i+1,n-1);
        
    }
    
    private void reverse(int[] nums,int left,int right){
        while(left<right){
            swap(nums,left,right);
            left++;
            right--;
        }
    }
    private void swap(int[] nums,int left,int right){
        int temp=nums[left];
        nums[left]=nums[right];
        nums[right]=temp;
    }
}