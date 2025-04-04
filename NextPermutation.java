// TC: O(n) in the worst case all numbers are traversed
// SC: O(1) as not auxilliary space is used
public class NextPermutation {
    public static void main(String[] args) {
        nextPermutation(new int[] { 1, 2, 3 }); // 1,3,2
        nextPermutation(new int[] { 3, 2, 1 }); // 1,2,3
        nextPermutation(new int[] { 1, 1, 5 }); // 1,5,1
    }

    public static void nextPermutation(int[] nums) {
        if (nums == null || nums.length == 0)
            return;
        int n = nums.length;
        // Find the smallest number starting from right. say x
        int i = n - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }
        // Find the next greater number right next to x and swap it with x
        int j = n - 1;
        if (i != -1) {
            while (j > i && nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }
        // reverse from x + 1 to n - 1
        reverse(nums, i + 1, n - 1);
        print(nums);
        System.out.println();
    }

    private static void swap(int[] nums, int l, int r) {
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
    }

    private static void reverse(int[] nums, int l, int r) {
        while (l < r) {
            swap(nums, l, r);
            l++;
            r--;
        }
    }

    private static void print(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
