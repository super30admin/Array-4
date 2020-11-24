class Solution {// time of O(n log n) and space of O(1)
    public int arrayPairSum(int[] nums) {
        //base case if array is empty
        int result = 0 ;
        Arrays.sort(nums);
        for(int i = 0 ; i < nums.length ; i+=2){
            result += nums[i];
        }
        return result;
    }
}