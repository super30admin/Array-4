#Time Complexity:O(n)
#Space Complexity:O(1)
#Approach:Sort the input array and add every even indexed element in the array to return the result.
class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        nums.sort()
        s=0
        for i in range(0,len(nums),2):
            s+=nums[i]
        return s