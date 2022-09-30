//Using sorting & then pairing them to get min to max the sum

class Solution {
    public int arrayPairSum(int[] nums) {
        if(nums == null || nums.length == 0)
            return 0;
        
        Arrays.sort(nums);
        int sum = 0;
        for(int i=0; i<nums.length; i = i + 2){
            sum = sum + nums[i];
        }
        return sum;
    }
}

//Time Complexity : O(n logn)
//Space Complexity :O(1)