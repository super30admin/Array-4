import java.util.Scanner;

public class NextPermutation {

        // FIND BREACH - SWAP WITH NEXT GREATER - REVERSE REST - TIME O(N) AND SPACE O(1)

        public void nextPermutation(int[] nums) {

            if(nums == null)     return;

            int n = nums.length;

            // 1. Find breach from right
            int i = n-2;

            // breach is when ascending order from right is broke
            while(i >= 0 && nums[i] >= nums[i+1]) {

                // move left from right
                i--;
            }

            // if iterator is -1, then there is no breach
            int breachIdx = i;

            // 2. Find next greater element from right if breach exists
            if(breachIdx >= 0) {

                // start from rightmost index
                int j = n-1;

                // find element from right that is just greater than breach element
                while(nums[j] <= nums[breachIdx]) {

                    // move left from right
                    j--;
                }

                // element just greater than breach exists as breach is already found
                int nextGreaterIdx = j;

                // swap breach element with its next greater value
                swapInplace(nums, breachIdx, nextGreaterIdx);
            }

            // 3. Reverse after breach part to get next permutation
            reverse(nums, breachIdx + 1, n-1);

        }

        // In Place swap method
        private void swapInplace(int[] nums, int f, int g) {

            // in place swap without a new temporary variable

            // do nothing if both indices are the same, leave element as it is
            if(f != g) {

                nums[f] = nums[f] + nums[g];

                nums[g] = nums[f] - nums[g];

                nums[f] = nums[f] - nums[g];
            }
        }

        // reverse method
        private void reverse(int[] nums, int l, int r) {

            // keeping pointers within bounds of reverse range
            while(l < r) {

                // swap edges
                swapInplace(nums, l, r);

                // move pointers inwards for reverse next pair
                l++;    r--;
            }
        }

        public static void main(String[] args) {

            NextPermutation obj = new NextPermutation();

            Scanner scanner = new Scanner(System.in);

            System.out.print("Permutation length: ");
            int n = scanner.nextInt();

            int[] nums = new int[n];

            System.out.println("Permutation: ");
            for(int i = 0; i < n; i++) {

                nums[i] = scanner.nextInt();
            }

            obj.nextPermutation(nums);

            System.out.println("Next Permutation: ");
            for(int i = 0; i < n; i++) {

                System.out.print(nums[i] + " ");
            }


        }

}

/*
TIME COMPLEXITY = O(N)
SPACE COMPLEXITY = O(1)
*/
