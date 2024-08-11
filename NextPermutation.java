/****
 Approach
 1. Start from the 2nd last element in the array and find the element which is
 lesser than its immediate right element
 2. Find the element which is just greater than the element found in step 1.
 3. Swap these 2 elements and reverse all elements to the right side of the index of element found in step 1.

 TC - O(n)
 SC - O(1)
 */

class NextPermutation {
    public void nextPermutation(int[] nums) {

        if(nums == null || nums.length == 0)
            return;

        //Discover the breach i.e the element smaller than its right
        int n = nums.length;
        int i = n-2;

        while(i >=0 && nums[i] >= nums[i+1]) {
            i--;
        }

        if(i != -1) {
            //Discover element just greater than the breached element and swap
            int j = n-1;
            while(j >=0 && nums[j] <= nums[i]) {
                j--;
            }

            swap(nums, i , j);

        }

        reverse(nums, i+1, n-1);
    }

    private void reverse(int[] nums, int l, int r) {
        while(l <= r) {
            swap(nums, l, r);
            l++;
            r--;
        }
    }

    private void swap(int[] nums, int l, int r) {
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
    }
}