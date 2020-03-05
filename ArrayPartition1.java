//TC : O(n)
//SC : O(1)
class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0; int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i=i+2){
           // min = Math.min(nums[i],nums[i+1]);
            sum = sum + nums[i];
        }
        return sum;
    }
}