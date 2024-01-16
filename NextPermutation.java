//T.C O(n) -- size of array
//S.C O(1)

//Observing the expected result, for next permutation, identify the breach from the end, if there is breach, swap the
// breach with next big num from last.  Sort the remaining elements from the breached position
class NextPermutation {
    public void nextPermutation(int[] nums) {
        //1. Identify the breach from the last
        int n = nums.length;
        int i = n-2;
        while(i>=0 && nums[i]>=nums[i+1]) i--;
        if(i>=0){ //There is breach
            int j = n-1;
            while(nums[j] <= nums[i]) j--;
            swap(nums, i, j);//2. swap the breach with next big number from the last
        }
        //3. sort the remaining elements from the breached position
        reverse(nums,i+1, n-1);
    }

    private void reverse(int[] nums, int l, int r){
        while(l<r){
            swap(nums, l, r);
            l++;
            r--;
        }
    }

    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
