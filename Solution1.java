// 561. Array Partition I
// Brute force
// Time - O(nlogn) for sorting
// Space - O(1)
class Solution1 {
    public int arrayPairSum(int[] nums) {
        if(nums == null || nums.length == 0)
            return 0;
        
        Arrays.sort(nums);
        
        int i = 0;
        int min = 0;
        while(i < nums.length - 1){
            min += Math.min(nums[i], nums[i + 1]);
            i+= 2;
        }
        
        
        return min;
        
    }
}