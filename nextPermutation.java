//Time complexity: O(N)
//Space complexity: O(1)

//Approach: 
//1. traverse back from end
//2. find first breach and swap smaller number with next largest in back array
//3. reverse back array because it is in decreasing order

class nextPerm {
    public void nextPermutation(int[] nums) {
        if(nums == null || nums.length == 0)
            return;
        
        int n = nums.length, i = n - 2;
        
        //iterate until we find breach
        while(i >= 0 && nums[i] >= nums[i + 1]){
            i--;
        }
        
        if(i >= 0){
            int j = n - 1;
            
            //decrement until you find next greater element
            while(nums[i] >= nums[j]){
                j--;
            }
            
            //swap i and j elements
            swap(nums, i, j);
        }
        
        reverse(nums, i + 1, n - 1);
    }
    
    private void reverse(int[] nums, int left, int right){
        while(left < right){
            swap(nums, left, right);
            
            left++;
            right--;
        }
    }
    
    private void swap(int[] nums, int left, int right){
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}