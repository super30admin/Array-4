public class NextPermutation {

    // TC : O(n)
    // SC : O(1)
    public void nextPermutation(int[] nums) {
        if(nums == null || nums.length == 0 ) return;

        int n = nums.length;

        //Step 1: Find the breach
        int i = n - 2;
        while(i >= 0 && nums[i] >= nums[i + 1]){
            i--;
        }

        //Step 2: Find the next larger element than the current i
        if(i >= 0){ // for 5 4 3 2 1 (all in descending order), i will go to -1
            int j = n - 1;
            while(j >=0 && nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i,j);
        }

        //Step 3: Reverse the sub-array starting from i + 1
        reverse(nums, i+1, n-1);
    }

    private void reverse(int[] nums, int low, int high) {
        while(low <= high){
            swap(nums, low, high);
            low++;
            high--;
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
