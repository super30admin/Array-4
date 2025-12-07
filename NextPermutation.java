/**
 * LeetCode: NextPermutation
 * Url: https://leetcode.com/problems/next-permutation
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class NextPermutation {

    // public void nextPermutation(Integer[] nums) {
    // int n = nums.length;
    // for (int i = n - 1; i >= 0; i--) {
    // for (int j = i - 1; j >= 0; j--) {
    // if (nums[i] > nums[j] && i - j == 1) {
    // // swap
    // swap(nums, i, j);
    // return;
    // } else if (nums[i] > nums[j] && i - j > 1) {
    // swap(nums, i, j);
    // if (j - i > 0)
    // reverse(nums, i + 1, nums.length - 1);
    // else
    // reverse(nums, j + 1, nums.length - 1);

    // return;
    // }
    // }

    // }
    // reverse(nums, 0, nums.length - 1);
    // return;
    // }

    public void nextPermutation(Integer[] nums) {
        int n = nums.length;

        int i = n - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) { // local minima breach
            i--;
        }

        if (i >= 0) { // nearest larger number

            int j = n - 1;
            while (nums[j] <= nums[i])
                j--;
            swap(nums, i, j);

        }

        reverse(nums, i + 1, n - 1);
    }

    void swap(Integer[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    void reverse(Integer[] nums, int i, int j) {
        while (i <= j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        Integer[] input = new Integer[] { 7, 5, 4, 2, 5, 4, 0, 3 };
        new NextPermutation().nextPermutation(input);
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i]);
            System.out.print(" ");
        }
        System.out.println();

        input = new Integer[] { 7, 5, 4, 2, 5, 4, 3, 0 };
        new NextPermutation().nextPermutation(input);
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i]);
            System.out.print(" ");
        }
        System.out.println();

        input = new Integer[] { 7, 5, 4, 3, 5, 4, 2, 0 };
        new NextPermutation().nextPermutation(input);
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i]);
            System.out.print(" ");
        }
        System.out.println();

        input = new Integer[] { 1, 3, 2 };
        new NextPermutation().nextPermutation(input);
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i]);
            System.out.print(" ");
        }
        System.out.println();

        input = new Integer[] { 2, 3, 1 };
        new NextPermutation().nextPermutation(input);
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i]);
            System.out.print(" ");
        }
        System.out.println();

        input = new Integer[] { 4, 2, 0, 2, 3, 2, 0 };
        new NextPermutation().nextPermutation(input);
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i]);
            System.out.print(" ");
        }
        System.out.println();
    }
}
