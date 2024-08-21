import java.util.Scanner;

public class NextPermutation {

    public void nextPermutation(int[] nums) {
        if (nums == null) return;
        int n = nums.length;
        int i = n - 2;

        // Step 1: Find the breach
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        // Step 2: Find the digit to swap with the breach digit
        if (i >= 0) {
            int j = n - 1;
            while (nums[i] >= nums[j]) {
                j--;
            }
            swap(nums, i, j);
        }

        // Step 3: Reverse the digits from i+1 to the end
        reverse(nums, i + 1, n - 1);
    }

    // Helper method to reverse the array
    private void reverse(int[] nums, int l, int r) {
        while (l < r) {
            swap(nums, l, r);
            l++;
            r--;
        }
    }

    // Helper method to swap elements in the array
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array from the user
        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        NextPermutation solution = new NextPermutation();
        solution.nextPermutation(nums);

        // Print the result
        System.out.println("Next permutation:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
