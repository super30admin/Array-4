//Time complexity: O(N)
//Space complexity: O(1)
class Solution {
    public int arrayPairSum(int[] nums) {
        //Sort all the small ones
        //Pair all the small ones with large one
        
        Arrays.sort(nums);
        System.out.print(Arrays.toString(nums));
        
        int sum = 0;
        for(int i = 0; i < nums.length-1; i+=2){
            sum += Math.min(nums[i],nums[i+1]);
        }
        
        return sum;
    }
}