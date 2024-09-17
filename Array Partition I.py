# TC: O(nlogn)
# SC: O(n)
# yes, it ran on leetcode
# no problems

class Solution:
    def arrayPairSum(self, nums) -> int:
        n = len(nums)/2
        groups = []
        
        start = 0
        end = start+1
        nums.sort()
        while(end < len(nums)):
            groups.append(min(nums[start], nums[end]))
            start +=2
            end = start+1
        
        return sum(groups)