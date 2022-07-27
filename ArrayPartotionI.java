import java.util.Arrays;
//Time Complexity=O(nlogn)
//Space Complexity=O(1)
public class ArrayPartotionI {

    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum=0;
        int n=nums.length;
        for(int i=0;i<n;i=i+2){
            sum+=nums[i];
        }

        return sum;
    }
}
