import java.util.Arrays;
import java.util.Scanner;

public class ArrayPartition {

    // Method to maximize the sum of min(ai, bi) for all i
    public int arrayPairSum(int[] nums) {
        //Sort the array
        Arrays.sort(nums);

        int maxSum = 0;

        //Sum up every element starting from index 0
        for (int i = 0; i < nums.length; i += 2) {
            maxSum += nums[i];
        }

        // Return the rsult
        return maxSum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Input array from the user
        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        ArrayPartition solution = new ArrayPartition();
        int result = solution.arrayPairSum(nums);

        System.out.println("The maximized sum of min(ai, bi) is: " + result);
    }
}
