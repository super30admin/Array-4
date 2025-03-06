class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        if len(nums) == 0:
            return -1
        rsum = nums[0]
        start = 0
        end = 0
        maximum = nums[0]
        for i in range(1,len(nums)):
            if rsum + nums[i] > nums[i]:
                rsum = rsum + nums[i] 
            else:
                rsum = nums[i]
                start = i
            if rsum > maximum:
                maximum = rsum
                end = i
        print(nums[start:end+1])
        return maximum

# TC : O(n)
# SC : O(1)