# Time Complexity : O(nlogn)
# Space Complexity :O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
# Your code here along with comments explaining your approach

class Solution:
    def arrayPairSum(self, nums) :
        if len(nums) == 0:
            return 0 
        nums.sort()
        res = 0 
        for i in range(0,len(nums),2):
            res += nums[i]
        return res

if __name__ == "__main__":
    s = Solution()
    print(s.arrayPairSum([1,4,3,2]))