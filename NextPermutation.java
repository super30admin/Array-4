class Solution {
    public void nextPermutation(int[] nums) {
        if(nums == null || nums.length == 0)
            return;
        
        int n = nums.length;
        
        //Find the breach element. Find the element from the last that is smaller than the element to its right
        int idx = -1;
        for(int i = n - 2; i>= 0; i--){
            if(nums[i] < nums[i+1]){
                idx = i;
                break;
            }
        }
        
        //Find a no that is just greater than the one at idx. If idx = -1, then the last permutation is there & no lager exists. So ignore that case.
        if(idx != -1){
            for(int i = n - 1; i > idx; i--){
                if(nums[i] > nums[idx]){
                    swap(nums, i, idx);
                    break;
                }
            }
        }
        
        //Now, reverse the rem half from idx + 1 onwards to get the next larger combination
        reverse(nums, idx + 1, n-1);
    }
    
    public void swap(int[] nums, int left, int right){
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
    
    public void reverse(int[] nums, int left, int right){
        while(left <= right){
            swap(nums, left, right);
            left++;
            right--;
        }
    }
}

//Time Complexity :O(n)
//Space Complexity :O(1)