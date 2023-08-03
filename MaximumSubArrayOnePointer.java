import java.util.Scanner;

public class MaximumSubArrayOnePointer {

        // ONE POINTER - TIME O(N) AND SPACE O(1)

        public int maxSubArray(int[] nums) {

            if(nums == null)              return 0;

            int currSum = nums[0];        int maxSum = nums[0];

            // iterate from first element as comparison happens from this position
            for(int i = 1; i < nums.length; i++) {       // O(N)

                // maximum of current element itself and current element added to current sum
                currSum = Math.max(currSum + nums[i], nums[i]);

                // max sum is maximum of current sum and current max sum
                maxSum = Math.max(currSum, maxSum);
            }
            // output
            return maxSum;
        }

        public static void main(String[] args) {

            MaximumSubArrayOnePointer obj = new MaximumSubArrayOnePointer();

            Scanner scanner = new Scanner(System.in);

            System.out.print("Array length: ");
            int n = scanner.nextInt();

            int[] nums = new int[n];

            System.out.println("Array: ");
            for(int i = 0; i < n; i++) {

                nums[i] = scanner.nextInt();
            }

            int answer = obj.maxSubArray(nums);

            System.out.print("Maximum subarray sum is  " + answer);
        }



}

/*
TIME COMPLEXITY = O(N)
SPACE COMPLEXITY = O(1)
*/

