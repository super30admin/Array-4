# Time Complexity :
# O(N Log N)

# Space Complexity :
# O(1) - There is no auxillary space being allocated

# Did this code successfully run on Leetcode :
#Yes

#We just sort the array. This will ensure that there is minimal loss between any pair

class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        nums.sort()
        result = 0
        for i in range(0,len(nums),2):
            result += nums[i]
        return result
