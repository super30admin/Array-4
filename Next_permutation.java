class Solution {
    //Time O(N)
    //Space O(1)
    public void nextPermutation(int[] nums) {
        if(nums == null || nums.length == 0)
        {
            return;
        }
        //Find the Breach
        int n = nums.length;
        int i = n-2;
        while(i >= 0 && nums[i] >= nums[i+1])
        {
            i--; //Skipping if digit > previous one
        }
        int j=n-1;
        while( i >= 0 &&i < j && nums[i] >= nums[j])
        {
            j--;
        }
        if(i >= 0)
        {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        //Reverse
        i = i+1 ; j = n-1;
        while(i <= j)
        {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++ ; j--;
        }
        return;
    }
}