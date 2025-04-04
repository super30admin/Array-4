import java.util.Arrays;

// TC: O(n log n) as all the elements in array are traversed and sorting is performed
// SC: O(1) no extra space is utilized
public class ArrayPartition {
    public static void main(String[] args) {
        System.out.println(arrayPairSum(new int[] { 1, 4, 3, 2 })); // 4
        System.out.println(arrayPairSum(new int[] { 6, 2, 6, 5, 1, 2 })); // 9
    }

    public static int arrayPairSum(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        int sum = 0;
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i < n; i += 2) {
            sum += nums[i];
        }
        return sum;
    }
}