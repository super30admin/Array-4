//time complexity-O(nlogn)
//Space complexity-O(1)
//Ran on leetcode-Yes
//Solution with comments-
class Solution {
    public int arrayPairSum(int[] nums) {
        if(nums==null || nums.length==0)
            return 0;
        Arrays.sort(nums);//sor the array so maximum numbers can be grouped together
        int i=0;
        int ans=0;
        while(i<nums.length){
            ans+=Math.min(nums[i],nums[i+1]);
            i=i+2;
        }
        
        return ans;
    }
}