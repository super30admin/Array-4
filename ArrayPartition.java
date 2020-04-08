/*
Time Complexity: O(NlogN ) as we are sorting the array
Space Complexity: O(1)
*/
class Solution {
    public int arrayPairSum(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        
        /*We need to form the pairings of the array's elements such that the overall sum of the 
        minimum out of such pairings is maximum. 
        Thus, we can look at the operation of choosing the minimum out of the pairing, 
        say (a, b) as incurring a loss of a−b (if a> b), in the maximum sum possible.*/
        Arrays.sort(nums);
        int sum=0;
        for(int i=0; i< nums.length; i=i+2){
            sum += nums[i];
        }
        return sum;
    }
}
