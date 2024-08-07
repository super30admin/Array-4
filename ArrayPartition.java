//TC - O(n log n)
//SC - O(1)
//Approach - Keep smaller elements together and larger ones together so that a smaller element does not dominate the larger term. 
class Solution {
    public int arrayPairSum(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }

        Arrays.sort(nums);
        int total = 0;
        for(int i = 0; i < nums.length; i++){
            //every even number
            if(i % 2 == 0){
                total = total + nums[i];
            }
        }
        return total;
    }
}