import java.util.Arrays;

public class ArrayPartition {

    // TC : O(n)
    // SC : O(1)
    public int arrayPairSum(int[] nums) {
        if(nums == null || nums.length == 0) return 0;

        // If we sort the elements and then form a pair then the loss is minimal
        // e.g. min(1,10) has a huge loss than min(1,2)
        Arrays.sort(nums);
        int answer = 0;
        for(int i=0; i < nums.length; i+=2) {
            answer += nums[i];
        }

        return answer;
    }
}
