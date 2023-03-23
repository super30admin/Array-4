public class NextPermutation {
    public void nextPermutation(int[] nums) {
        if(nums==null) return;
        int n = nums.length;
        int i = n-2;

        // 1. find breach
        while(i>=0 && nums[i]>=nums[i+1]){
            i--;
        }

        // 2. find digit to be swapped with
        int j = n-1;
        if(i!=-1){
            while(nums[j]<=nums[i]){
                j--;
            }
            swap(nums,i,j);
        }

        // 3. reverse from i+1
        reverse(nums,i+1,n-1);

    }
    private void reverse(int[] nums, int l, int r){
        while(l<r){
            swap(nums,l,r);
            l++;
            r--;
        }
    }
    private void swap(int[] nums, int i, int j){
        if(i!=j){
            nums[i] = nums[i] + nums[j];
            nums[j] = nums[i] - nums[j];
            nums[i] = nums[i] - nums[j];
        }
    }
}

// Time Complexity - O(n)
// Space Complexity - O(1)