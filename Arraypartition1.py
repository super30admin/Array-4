'''
Time Complexity : O(nlogn)//sorting + traversing
Space Complexity : O(1)

Approch sort the array and sum the min of pair of two
'''


class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        nums.sort()
        ans = 0
        for i in range(0,len(nums),2):
            ans += min(nums[i],nums[i+1])
        return ans
        
    