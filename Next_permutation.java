class Solution {
    public void nextPermutation(int[] nums) {
        if(nums==null) return;
        int n = nums.length;
        //find the breach
        int i = n-2;
        while(i>=0 && nums[i]>= nums[i+1]){
            i--;
            
        }
        //get the number to swap with it 
        if(i>=0){
            int j = n-1;
            while(nums[j]<= nums[i]){
                j--;
            }
            swap(nums,i,j);
        }
        //reverse the digits
        reverse(nums,i+1,n-1);
        
    }
    
    private void reverse(int [] nums, int l,int r){
        while(l<r){
            swap(nums,l,r);
            l++;r--;
        }
    }
    
    private void swap(int [] nums,int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
                      
    }
    
    
}