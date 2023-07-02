// tc : O(n)
// sc : O(1)

class Solution {
    public void nextPermutation(int[] nums) {
        //base case 
        if(nums.length==1) return;

        int curr = nums.length-2;
        while(curr>=0 && nums[curr]>= nums[curr+1]) curr--;

        if(curr>=0){
            int ind = nums.length-1;
            while(nums[ind]<=nums[curr]) ind--;
            swap(nums, ind , curr);
        }
        reverse(nums,curr+1,nums.length-1);
    }

    private void swap(int[] nums, int i , int j){
        int temp = nums[i]; nums[i]= nums[j]; nums[j]= temp;
    }

    private void reverse(int[] nums, int i , int j ){
        while(i<j)swap(nums,i++,j--);
    }
}
