//Time Complexity : O(n)
//Space Complexity : O(1)
public class NextPermutation {
    public void nextPermutation(int[] nums) {
        int n = nums.length;

        int breach = n-2;

        while(breach >=0 && nums[breach] >= nums[breach +1]) breach--;

        if(breach >=0){
            // get the just bigger number
            int j = n-1;
            while(nums[j] <= nums[breach]) j--;
            swap(nums, breach, j);
        }

        reverse(nums, breach +1, n-1);
    }

    private void reverse(int[] nums, int l, int r){
        while(l < r){
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
