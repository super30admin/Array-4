// Time Complexity: O(n log n) because of sorting
// Space complexity: O(1)
import java.util.Arrays;

public class ArrayPartition {
    public int minSum(int[] nums){
        Arrays.sort(nums);
        int sum = 0;
        for (int i =0; i < nums.length; i+=2){
            sum = sum + nums[i];
        }
        return sum;
    }

    public static void main(String[] args){
        ArrayPartition solution = new ArrayPartition();

        int [] nums = {6,2,6,5,1,2};
        System.out.println(solution.minSum(nums));
    }
}
