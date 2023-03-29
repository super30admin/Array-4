//TC: O(nlogn)
//SC:O(1)
class Solution {
    public int arrayPairSum(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        Arrays.sort(nums);
        int n = nums.length;
        int result = 0;
        for(int i=0; i< n; i+=2){
            result +=  nums[i];
        }
        
        return result;
    }
}
