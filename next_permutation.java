//TC: O(n) 
//SC: O(1)
public class next_permutation {
    
    public static void nextPermutation_tp(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return;
        }

        int len = nums.length;
        int left = len - 2;
        
        while (left >= 0 && nums[left] >= nums[left + 1]) {
            left--;
        }

        if (left >= 0) {
            int right = nums.length - 1;
            while (right >= 0 && nums[left] >= nums[right]) {
                right--;
            }
            swap(nums, left, right);
        }

        
         // flip the right to make the number smaller.
         
        reverse(nums, left + 1);
    }

    public static void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public static void reverse(int[] nums, int low) {
        int left = low;
        int right = nums.length - 1;
        while (left < right) {
            swap(nums, left, right);
            left++;
            right--;
        }
    }
}
