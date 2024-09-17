//TC: O(nlogn)
//SC: O(nlogn)

class Solution {
    public int arrayPairSum(int[] nums) {
        //sanity check
        if(nums == null || nums.length == 0){
            return 0;
        }
        
        Arrays.sort(nums);
        
        int sum = 0;
        for(int x = 0;x<nums.length;x+=2){
            sum += nums[x];
            
        }
        
        return sum;
    }
}