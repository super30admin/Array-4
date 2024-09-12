// tc: O(nlogn)
// sc: O(1)

class Solution {
    public int arrayPairSum(int[] nums) {
        int max=0;
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<n;i=i+2){
            max=max+nums[i];
        }
        
        return max;
    }
}
