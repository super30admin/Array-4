import java.util.Scanner;
import java.util.Arrays;
public class ArrayPartitionPairsMaxSumOfMinsArraysSort {

        // ARRAY SORT - TIME O(NlogN) AND SPACE O(1)

        public int arrayPairSum(int[] nums) {

            int maxSum = 0;

            // sort and pair adjacent numbers so that difference between numbers of a pair is minimum thereby maximising sum of minimums of pairs which are not too far from their pair partners
            Arrays.sort(nums);              // O(NlogN)

            // iterate alternatively to get minimums of pairs
            for(int i = 0; i < nums.length; i += 2) {    // O(N)

                // add minimums to result
                maxSum += nums[i];
            }

            // output maximum sum
            return maxSum;
        }

        public static void main(String[] args) {

            ArrayPartitionPairsMaxSumOfMinsArraysSort obj = new ArrayPartitionPairsMaxSumOfMinsArraysSort();

            Scanner scanner = new Scanner(System.in);

            System.out.print("Array length: ");
            int n = scanner.nextInt();

            int[] nums = new int[n];

            System.out.println("Array: ");
            for(int i = 0; i < n; i++) {

                nums[i] = scanner.nextInt();
            }

            int answer = obj.arrayPairSum(nums);

            System.out.println("Maximized sum of minimums of pairs of partitioned array is " + answer);
        }

}

/*
TIME COMPLEXITY = O(NlogN)
SPACE COMPLEXITY = O(1)
*/

