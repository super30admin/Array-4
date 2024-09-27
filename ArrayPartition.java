//time is o(n) and space is o(1)
//passed all leetcode cases
//used approach discussed in class i.e. sort the array

class Solution {
    public int arrayPairSum(int[] nums) {
        if(nums==null||nums.length==0) return 0;
        Arrays.sort(nums);
        int n = nums.length;
        int sum=0;
        for(int i=0;i<n/2;i++){
            sum+=nums[2*i];
        }
        return sum;

    }
}