import java.util.Arrays;

public class arraypartition {
    //Onlogn TC O1 SC
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int re=0;
        for(int i=0;i<nums.length;i=i+2){
            re=re+nums[i];
        }
        return re;
    }
}
