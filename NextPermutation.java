// Time Complexity: O(3n) - O(n)
// Space Complexity : O(1)
import java.util.Arrays;

public class NextPermutation {
    public void nextPermutation(int[] nums){
        int n = nums.length;
        int i = n - 2; // We start traversing array from the end so that it does not go out of bounds

        // take example {1,3,5,4,2}

        // find the first decreasing element from the right

        while (i >= 0 && nums[i] >= nums[i+1]) {
            i--; // continue moving back

        } // in the array {1,3,5,4,2} - first element decreasing from the right is 3
        if(i >=0){
            // find the first element on the right of nums[i] (3) that is greater than 3
            int j = n -1; // start from end
            while(nums[j] <= nums[i]){
                j--; // keep moving backward
            }
            // swap the nums[i] with next greater element so now array becomes {1,4,5,3,2}
            swap(nums, i, j);
        }
        reverse(nums, i+1, n-1); // reverse the numbers on right from i+1 to the end
    }

    private void swap(int [] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    private void reverse(int [] nums, int start, int end){
        while(start < end){
            swap(nums, start, end);
            start++;
            end--;
        }
    }
    public static void main (String[] args){
        NextPermutation solution = new NextPermutation();
        int [] nums = {1,3,5,4,2};
        solution.nextPermutation(nums);
        System.out.println("Next Permutation:" + Arrays.toString(nums));
    }
}
