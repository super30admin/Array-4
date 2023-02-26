// Time Complexity = O(n)
// Space Complexity = O(1)

class Solution {
    public void nextPermutation(int[] nums) {
        if(nums == null) return;
        int n = nums.length;
        
        int i = n -2;
        while(i >= 0 && nums[i] >= nums[i+1]){
            i--;
        }
        int j =  n-1;
        if(i >= 0){
            while(nums[i] >= nums[j]){
                j--;
            }
            swap(nums, i, j);
        }
        reverse(nums, i+1, n-1);
    } 
    private void swap (int [] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
    
    private void reverse(int [] nums, int low, int high){
        while(low < high){
            swap(nums, low, high);
            low++;
            high --;
        }
    }
}