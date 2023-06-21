class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int a =0;
        for(int i = 0; i<nums.length; i+=2){
            a += nums[i];
        }

        return a;
    }
}
//tc = O(n)
//sc = O(1)
