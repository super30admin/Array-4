//Time Complexity - O(nlogn)
class Solution {
    public int arrayPairSum(int[] nums) {
        if(nums == null | nums.length == 0){
            return 0;
        }
        Arrays.sort(nums);
        int sum = 0;
        for(int i = 0; i < nums.length; i+= 2){
            sum = sum + nums[i]; 
        }
        return sum;
    }
}