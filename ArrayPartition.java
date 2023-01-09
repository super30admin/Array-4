import java.util.Arrays;

public class ArrayPartition {

    //TC O(n) //SC O(1)
    public int arrayPairSum(int[] nums) {
        if(nums == null || nums.length ==0) return 0;
        int n = nums.length;
        Arrays.sort(nums);
        int result =0;
        for(int i =0;i<n;i=i+2){
            result = result + nums[i];
        }
        return result;
    }
}
