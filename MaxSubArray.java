import java.util.Scanner;

class MaxSubArray {
    public int maxSubArray(int[] nums) {
        int rSum = nums[0]; // Initialize rSum with the first element
        int max = nums[0];  // Initialize max with the first element

        // Starting the loop from the second element
        for (int i = 1; i < nums.length; i++) {
            rSum = Math.max(nums[i], rSum + nums[i]); // Updating rSum
            max = Math.max(max, rSum);               // Updating max
        }
        return max; 
    }

    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        //Input array from the user
        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        MaxSubArray solution = new MaxSubArray();
        int result = solution.maxSubArray(nums);

        // Print the result
        System.out.println("The maximum subarray sum is: " + result);

    
    }
}
