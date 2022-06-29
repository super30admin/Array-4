import java.util.Arrays;

//Time Complexity : O(nlogn)
//Space Complexity : O(n)
class Solution {
    public int arrayPairSum(int[] nums) {
        if(nums == null || nums.length == 0)return 0;
        int result = 0;
        //sort and add the every first element 
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i=i+2){
            result = result + nums[i];
        }
        return result;
    }
}