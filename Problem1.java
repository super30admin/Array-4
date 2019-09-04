//TC:O(n)
//SC:O(1)

//idea 
//1. Sort the array to avoid losing the maximum element as mininmum in the another pair.
//2. Caluculater sum of all first element in pair(since array is sorted it is min)

class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum=0;
        for(int i=0; i<nums.length;i+=2){
            sum += nums[i];
        }
        return sum;
    }
}        
