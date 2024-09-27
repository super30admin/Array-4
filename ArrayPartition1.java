class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);//sort the array
        int sum  = 0;
        
        //skip one element at a time to get maximized sum
        for(int i = 0; i < nums.length; i = i + 2){
            sum += nums[i];
        }
        
        //return maximized sum
        return sum;
    }
}
//Time Complexity: O(nlogn)
//Space Complexity: O(1)
