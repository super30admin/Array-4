
class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        """
        time:O(nLogn)
        space: O(1)
        
        """
        ans = 0
        nums.sort()
        for i in range(0,len(nums), 2):
            
            ans += nums[i]
        return ans

            