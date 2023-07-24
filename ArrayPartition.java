import java.util.Arrays;

public class ArrayPartition {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        ArrayPartition solution = new ArrayPartition();
        int[] nums = { 1, 4, 3, 2, 5, 6 };
        int maxSum = solution.arrayPairSum(nums);
        System.out.println("Maximized Sum: " + maxSum);
    }

}
