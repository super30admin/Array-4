// TC: O(n)
// SC: O(1)

public class NextPermutation {
    public void nextPermutation(int[] nums) {
        
        int i=nums.length-2;
        // Getting the first peak element index - 1 from right
        while(i>=0 && nums[i+1] <= nums[i]){
            i--;            
        }
        // Getting the element greater than nums[first peak element - 1] element
        if (i >= 0) {
            int j = nums.length - 1;
            while (j >= 0 && nums[j] <= nums[i]) {
                j--;
            }
            // swaping the 2 elements nums[peak element - 1] and first element greater than it
            swap(nums, i, j);
        }
        // reversing all elements after the first peak from right
        reverse(nums, i + 1);
    }
    
    private void reverse(int[] nums, int start) {
        int i = start, j = nums.length - 1;
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}