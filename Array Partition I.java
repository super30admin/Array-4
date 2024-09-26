/*
class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        if nums is None or len(nums) == 0:
            return 0
        
        nums.sort()
        summ = 0
        for i in range(0, len(nums), 2):
            summ += nums[i]
        return summ
*/

// time - O(nlogn)
// space - O(1)
// logic - the sum will be maximum when pairs are formed such that absolute difference between them is minimum so array is sorted and 
// pairs would be first two index then next two and so on. Hence adding just even indexes will serve the purpose
class Solution {
    public int arrayPairSum(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        
        Arrays.sort(nums);
        int sum = 0;
        for (int i=0; i<nums.length; i+=2){
            sum += nums[i];
        }
        return sum;
    }
}