//TIME COMPLEXITY: O(N)
//SPACE COMPLEXITY: O(1)
class Solution {
    public void nextPermutation(int[] nums) {
	
        for(int i = nums.length - 1; i > 0; i--){
            if(nums[i] > nums[i - 1]){    
                for(int j = nums.length - 1 ; j >= i ; j--){
                    if(nums[i - 1] < nums[j]){
                        swap(nums, i - 1, j);
                        reverse(nums, i);
                        return;
                    }
                }
            }
        }
        
        reverse(nums, 0);
    }
    
    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    private void reverse(int[] nums, int start){
        int counter = 0;
        int end = nums.length - 1;
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }

    }
}
