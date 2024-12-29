// the reason we sort this out, because we want to reduce the difference 
// between two numbers in a pair, we can use the bigger number in a different place.
// This is a greedy approach we follow.
// Time complexity = O(nlog(n))
class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        int sum =0;
        while(i< nums.length) {
            sum+= nums[i];
            i+=2;
        }
        return sum;
    }
}