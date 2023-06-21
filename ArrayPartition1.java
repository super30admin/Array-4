import java.util.*;
public class ArrayPartition1 {
    //TC=O(nlogn) SC=O(1)
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int max=0;
        for(int i=0;i<nums.length;i+=2){
            max+=nums[i];
        }
        return max;
    }
}
