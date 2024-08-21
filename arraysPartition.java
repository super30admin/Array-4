/*
TC --> O(nlogn)
SC --> O(1)
*/
class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        int val = 0;
        while(i<nums.length-1){
            val+=nums[i];
            i+=2;
        }//while

        return val;
    }
}