Time Complexity: O(n log n)
Space Complexity: O(1)
Leet Code: Yes
Issue: No

class Solution {
    public int arrayPairSum(int[] nums) {
        //validate
        if(nums==null || nums.length==0) return 0;
        
        //logic
        int sum=0;
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i=i+2){
            sum+=nums[i];
        }
        return sum;
    }
}
