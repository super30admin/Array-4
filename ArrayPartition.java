import java.util.Arrays;

class Solution {
    public int arrayPairSum(int[] nums) {
        //sort and then arrayPairSum
        Arrays.sort(nums);
        int result = 0;
        for(int i =0;i+1<= nums.length-1;i=i+2){
            result += nums[i];
        }
        return result;
    }
}