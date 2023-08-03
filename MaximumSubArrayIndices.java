import java.util.Scanner;

public class MaximumSubArrayIndices {

        // MAXIMUM SUB ARRAY SUM WITH RANGE INDICES - TIME O(N) AND SPACE O(1)

        public int maxSubArray(int[] nums) {

            if(nums == null)              return 0;

            int currSum = nums[0];        int maxSum = nums[0];

            int maxBegin = 0;             int maxEnd = 0;
            int currBegin = 0;

            // iterator i is the end pointer of current sub array
            // iterate from first element as comparison happens from this position
            for(int i = 1; i < nums.length; i++) {       // O(N)

                currSum += nums[i];

                if(currSum < nums[i]) {

                    // if element itself is larger than it added to current sum, update element as current sub array
                    currSum = nums[i];

                    // current sub array begin and end is element itself
                    currBegin = i;
                }

                // if current sub array sum exceeds that of existing maximum sub array, update maximum sub array to the current sub array
                if(maxSum < currSum) {

                    maxSum = currSum;

                    // update maximum sub array range as it is for current sub array
                    maxBegin = currBegin;

                    maxEnd = i;
                }
            }
            // output

            System.out.println("Maximum Subarray begin index is " + maxBegin);
            System.out.println("Maximum Subarray end index is " + maxEnd);

            return maxSum;
        }

        public static void main(String[] args) {

            MaximumSubArrayIndices obj = new MaximumSubArrayIndices();

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

// -2,1,-3,4,-1,2,1,-5,4