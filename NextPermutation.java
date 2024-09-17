//TimeComplexity: O(n)
//SpaceComplexity: O(1)
class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        if(n<=1)return;
        
        int i = n-2;
        
        while(nums[i]>= nums[i+1]){
            i--;
            if(i == -1)break;
        }
        
        if(i>= 0){
            int j = n-1;
            while(nums[j]<= nums[i]){
                j--;
            }
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        reverse(nums,i+1,n-1);
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
