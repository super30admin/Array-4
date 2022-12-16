import java.util.Arrays;

public class MaxSubArrayIndices {
    // Similar to MaxSubArray question.
    // The only difference is we need to find the indices and not just the max sum
    public int[] maxSubArray(int[] nums) {

        if(nums == null || nums.length == 0) return new int[]{};

        int rSum = nums[0], max = nums[0];
        int currStart = 0, start = 0, end = 0;

        for(int i=1; i < nums.length; i++){
            if(nums[i] > rSum + nums[i]){
                currStart = i; // currStart holds the current start of the window
                                // assuming this start position of the window will hold an array having max sum
                                // this just an assumption based on the if condition
                rSum = nums[i];
            }else if(nums[i] < rSum + nums[i])
                rSum = rSum + nums[i];

            if(rSum > max){
                max = rSum;
                start = currStart;
                end = i;
            }
        }

        return new int[]{start, end};
    }

    public static void main(String[] args) {
        MaxSubArrayIndices indices = new MaxSubArrayIndices();
        // int[] nums = {-2, 1, -3, 4, -1, 2, 1, 2, 3};
        int[] nums = {5,4,-1,7,8};
        int[] ints = indices.maxSubArray(nums);

        Arrays.stream(ints)
                .forEach(System.out::println);
    }
}
