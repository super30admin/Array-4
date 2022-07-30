//TC : O(nlogn)
//SC : O(1)

class Solution {
    public int arrayPairSum(int[] nums) {
        if(nums == null || nums.length == 0)return 0;
        
        int result = 0;
        Arrays.sort(nums);
        
        for(int i = 0; i< nums.length; i = i + 2){
            result += nums[i];
        }
        
        return result;
    }
}
