public class NextPermutation {
    //time complexity - o(n)
    // space  complexity - (1)
    public void nextPermutation(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }
        // Find the breach. i,e elemt which is smaller than its element to its right.
        // So start from second last element so we always have an element ot compare
        // with.
        int n = nums.length;
        int i = n - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }
        // Discover the elemnt that is just greater than the element at index i and swap
        // with elemnt at index i.
        // and only if the breach is descovered with in breach perform following steps
        if (i != -1) {
            int j = n - 1;
            while (j >= 0 && nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }
        // Reverse the array from i+1 i,e where the breach was found and swap is done to
        // find next permutation
        reverse(nums, i + 1, n - 1);
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private void reverse(int[] nums, int l, int r) {
        while (l <= r) {
            swap(nums, l, r);
            l++;
            r--;
        }
    }
}
