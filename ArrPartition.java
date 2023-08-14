class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);              //O(n log n)
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0)
            max+=nums[i];
        }
        return max;
    }
}
