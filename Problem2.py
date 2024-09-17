#Time complexity: O(n)
#Space complexity: O(1)
#Works on leetcdoe - yes
#Approach: Here keep a local and global maximum and  we just iterate through the nums startign from second element. We get 
# the local max will be max of either current element or previous local + current element. 

class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        if not nums:
            return 0
        maxx = cur = nums[0]
        for n in nums[1:]:
            cur = max(cur+n,n)
            maxx = max(cur,maxx)
        return maxx